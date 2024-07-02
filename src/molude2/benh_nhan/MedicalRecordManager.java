package molude2.benh_nhan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class MedicalRecordManager {
    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewMedicalRecord();
                    break;
                case 2:
                    deleteMedicalRecord();
                    break;
                case 3:
                    showMedicalRecords();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("-------- MENU --------");
        System.out.println("1. Thêm mới bệnh án");
        System.out.println("2. Xóa bệnh án");
        System.out.println("3. Xem danh sách bệnh án");
        System.out.println("4. Thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    private static void addNewMedicalRecord() {
        try {
            List<BenhAn> medicalRecords = CSVFileHandler.readMedicalRecords();
            System.out.println("Nhập thông tin bệnh án mới:");

            int soThuTuBenhAn = medicalRecords.isEmpty() ? 1 : medicalRecords.get(medicalRecords.size() - 1).getSoThuTuBenhAn() + 1;

            System.out.print("Nhập mã bệnh án (BA-XXX): ");
            String maBenhAn = scanner.nextLine().trim();
            if (!maBenhAn.matches("^BA-\\d{3}$")) {
                throw new IllegalArgumentException("Mã bệnh án không đúng định dạng (BA-XXX).");
            }
            if (isMaBenhAnExists(maBenhAn, medicalRecords)) {
                throw new DuplicateMedicalRecordException("Bệnh án đã tồn tại.");
            }

            System.out.print("Nhập mã bệnh nhân (BN-XXX): ");
            String maBenhNhan = scanner.nextLine().trim();
            if (!maBenhNhan.matches("^BN-\\d{3}$")) {
                throw new IllegalArgumentException("Mã bệnh nhân không đúng định dạng (BN-XXX).");
            }

            System.out.print("Nhập tên bệnh nhân: ");
            String tenBenhNhan = scanner.nextLine().trim();

            System.out.print("Nhập ngày nhập viện (dd/MM/yyyy): ");
            LocalDate ngayNhapVien = LocalDate.parse(scanner.nextLine().trim(), formatter);

            System.out.print("Nhập ngày ra viện (dd/MM/yyyy, bỏ trống nếu chưa có): ");
            String ngayRaVienStr = scanner.nextLine().trim();
            LocalDate ngayRaVien = ngayRaVienStr.isEmpty() ? null : LocalDate.parse(ngayRaVienStr, formatter);

            System.out.print("Nhập lý do nhập viện: ");
            String lyDoNhapVien = scanner.nextLine().trim();

            BenhAn benhAn;
            if (ngayRaVien != null) {
                if (ngayNhapVien.isAfter(ngayRaVien)) {
                    throw new IllegalArgumentException("Ngày nhập viện phải trước hoặc bằng ngày ra viện.");
                }
            }

            if (ngayRaVien == null) {
                System.out.print("Nhập phí nằm viện (VNĐ): ");
                long phiNamVien = Long.parseLong(scanner.nextLine().trim());
                benhAn = new BenhAnThuong(soThuTuBenhAn, maBenhAn, maBenhNhan, tenBenhNhan,
                        ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
            } else {
                System.out.print("Chọn loại VIP (VIP_I, VIP_II, VIP_III): ");
                LoaiVIP loaiVIP = LoaiVIP.valueOf(scanner.nextLine().trim());
                System.out.print("Nhập thời hạn VIP (dd/MM/yyyy): ");
                LocalDate thoiHanVIP = LocalDate.parse(scanner.nextLine().trim(), formatter);
                benhAn = new BenhAnVIP(soThuTuBenhAn, maBenhAn, maBenhNhan, tenBenhNhan,
                        ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVIP, thoiHanVIP);
            }

            medicalRecords.add(benhAn);
            CSVFileHandler.writeMedicalRecords(medicalRecords);
            System.out.println("Thêm mới bệnh án thành công.");
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    private static void deleteMedicalRecord() {
        try {
            List<BenhAn> medicalRecords = CSVFileHandler.readMedicalRecords();
            System.out.print("Nhập mã bệnh án cần xóa: ");
            String maBenhAnXoa = scanner.nextLine().trim();
            boolean found = false;
            for (BenhAn benhAn : medicalRecords) {
                if (benhAn.getMaBenhAn().equals(maBenhAnXoa)) {
                    found = true;
                    System.out.print("Xác nhận xóa bệnh án có mã " + maBenhAnXoa + "? (Yes/No): ");
                    String confirmation = scanner.nextLine().trim();
                    if (confirmation.equalsIgnoreCase("Yes")) {
                        medicalRecords.remove(benhAn);
                        CSVFileHandler.writeMedicalRecords(medicalRecords);
                        System.out.println("Xóa bệnh án thành công.");
                    } else {
                        System.out.println("Đã hủy xóa bệnh án.");
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy bệnh án có mã " + maBenhAnXoa);
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    private static void showMedicalRecords() {
        try {
            List<BenhAn> medicalRecords = CSVFileHandler.readMedicalRecords();
            System.out.println("Danh sách bệnh án:");
            for (BenhAn benhAn : medicalRecords) {
                System.out.println("------------------------------");
                System.out.println("Loại bệnh án: " + benhAn.loaiBenhAn());
                System.out.println("Số thứ tự: " + benhAn.getSoThuTuBenhAn());
                System.out.println("Mã bệnh án: " + benhAn.getMaBenhAn());
                System.out.println("Mã bệnh nhân: " + benhAn.getMaBenhNhan());
                System.out.println("Tên bệnh nhân: " + benhAn.getTenBenhNhan());
                System.out.println("Ngày nhập viện: " + benhAn.getNgayNhapVien().format(formatter));
                System.out.println("Ngày ra viện: " + (benhAn.getNgayRaVien() != null ? benhAn.getNgayRaVien().format(formatter) : ""));
                System.out.println("Lý do nhập viện: " + benhAn.getLyDoNhapVien());
                if (benhAn instanceof BenhAnThuong) {
                    System.out.println("Phí nằm viện: " + ((BenhAnThuong) benhAn).getPhiNamVien() + " VNĐ");
                } else if (benhAn instanceof BenhAnVIP) {
                    System.out.println("Loại VIP: " + ((BenhAnVIP) benhAn).getLoaiVIP());
                    System.out.println("Thời hạn VIP: " + ((BenhAnVIP) benhAn).getThoiHanVIP().format(formatter));
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    private static boolean isMaBenhAnExists(String maBenhAn, List<BenhAn> medicalRecords) {
        for (BenhAn benhAn : medicalRecords) {
            if (benhAn.getMaBenhAn().equals(maBenhAn)) {
                return true;
            }
        }
        return false;
    }
}
