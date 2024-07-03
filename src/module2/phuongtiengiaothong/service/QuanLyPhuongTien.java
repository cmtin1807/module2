package module2.phuongtiengiaothong.service;

import module2.phuongtiengiaothong.molde.Oto;
import module2.phuongtiengiaothong.molde.PhuongTienGiaoThong;
import module2.phuongtiengiaothong.molde.XeMay;
import module2.phuongtiengiaothong.molde.XeTai;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyPhuongTien {
    private static final String FILE_XE_TAI = "src/molude2/phuongtiengiaothong/data/xeTai.csv";
    private static final String FILE_O_TO = "src/molude2/phuongtiengiaothong/data/oto.csv";
    private static final String FILE_XE_MAY = "src/molude2/phuongtiengiaothong/data/xeMay.csv";

    private List<PhuongTienGiaoThong> dsXeTai;
    private List<PhuongTienGiaoThong> dsOto;
    private List<PhuongTienGiaoThong> dsXeMay;

    public QuanLyPhuongTien() {
        dsXeTai = new ArrayList<>();
        dsOto = new ArrayList<>();
        dsXeMay = new ArrayList<>();
    }

    public void themPhuongTien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại phương tiện:");
        System.out.println("1. Ôtô");
        System.out.println("2. Xe tải");
        System.out.println("3. Xe máy");
        System.out.print("Chọn loại phương tiện: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Nhập thông tin chung
        System.out.print("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Nhập số chỗ ngồi: ");
                int soChoNgoi = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.print("Nhập kiểu xe: ");
                String kieuXe = scanner.nextLine();

                Oto oto = new Oto(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
                dsOto.add(oto);
                luuVaoFile(FILE_O_TO, oto.toCSVString());
                System.out.println("Đã thêm mới ôtô thành công.");
                break;
            case 2:
                System.out.print("Nhập trọng tải: ");
                int trongTai = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
                dsXeTai.add(xeTai);
                luuVaoFile(FILE_XE_TAI, xeTai.toCSVString());
                System.out.println("Đã thêm mới xe tải thành công.");
                break;
            case 3:
                System.out.print("Nhập công suất: ");
                int congSuat = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
                dsXeMay.add(xeMay);
                luuVaoFile(FILE_XE_MAY, xeMay.toCSVString());
                System.out.println("Đã thêm mới xe máy thành công.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }

    public void hienThiPhuongTien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại phương tiện cần hiển thị:");
        System.out.println("1. Hiển thị ôtô");
        System.out.println("2. Hiển thị xe tải");
        System.out.println("3. Hiển thị xe máy");
        System.out.print("Chọn loại phương tiện: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                System.out.println("Danh sách ôtô:");
                for (PhuongTienGiaoThong pt : dsOto) {
                    pt.hienThiThongTin();
                }
                break;
            case 2:
                System.out.println("Danh sách xe tải:");
                for (PhuongTienGiaoThong pt : dsXeTai) {
                    pt.hienThiThongTin();
                }
                break;
            case 3:
                System.out.println("Danh sách xe máy:");
                for (PhuongTienGiaoThong pt : dsXeMay) {
                    pt.hienThiThongTin();
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }

    public void xoaPhuongTien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát cần xóa: ");
        String bienKiemSoat = scanner.nextLine();

        for (PhuongTienGiaoThong pt : dsOto) {
            if (pt.bienKiemSoat.equals(bienKiemSoat)) {
                dsOto.remove(pt);
                xoaKhoiFile(FILE_O_TO, pt.toCSVString());
                System.out.println("Đã xóa ôtô có biển số " + bienKiemSoat + " thành công.");
                return;
            }
        }

        // Xóa trong xe tải
        for (PhuongTienGiaoThong pt : dsXeTai) {
            if (pt.bienKiemSoat.equals(bienKiemSoat)) {
                dsXeTai.remove(pt);
                xoaKhoiFile(FILE_XE_TAI, pt.toCSVString());
                System.out.println("Đã xóa xe tải có biển số " + bienKiemSoat + " thành công.");
                return;
            }
        }

        // Xóa trong xe máy
        for (PhuongTienGiaoThong pt : dsXeMay) {
            if (pt.bienKiemSoat.equals(bienKiemSoat)) {
                dsXeMay.remove(pt);
                xoaKhoiFile(FILE_XE_MAY, pt.toCSVString());
                System.out.println("Đã xóa xe máy có biển số " + bienKiemSoat + " thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy phương tiện có biển số " + bienKiemSoat + " để xóa.");
    }

    private void luuVaoFile(String tenFile, String data) {
        try (FileWriter writer = new FileWriter(tenFile, true)) {
            writer.write(data + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void xoaKhoiFile(String tenFile, String data) {
        // Code để xóa dữ liệu từ file
        // Đây là phần có thể cải tiến để xóa theo yêu cầu
    }
}