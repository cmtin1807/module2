package module2.benh_nhan;


import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CSVFileHandler {
    private static final String FILE_PATH = "data/medical_records.csv";
    private static final String CSV_SEPARATOR = ",";

    public static List<BenhAn> readMedicalRecords() {
        List<BenhAn> medicalRecords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(CSV_SEPARATOR);
                int soThuTuBenhAn = Integer.parseInt(values[0]);
                String maBenhAn = values[1];
                String maBenhNhan = values[2];
                String tenBenhNhan = values[3];
                LocalDate ngayNhapVien = LocalDate.parse(values[4]);
                LocalDate ngayRaVien = values[5].isEmpty() ? null : LocalDate.parse(values[5]);
                String lyDoNhapVien = values[6];
                if (values.length == 7) {
                    long phiNamVien = Long.parseLong(values[7]);
                    medicalRecords.add(new BenhAnThuong(soThuTuBenhAn, maBenhAn, maBenhNhan,
                            tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien));
                } else {
                    LoaiVIP loaiVIP = LoaiVIP.valueOf(values[7]);
                    LocalDate thoiHanVIP = LocalDate.parse(values[8]);
                    medicalRecords.add(new BenhAnVIP(soThuTuBenhAn, maBenhAn, maBenhNhan,
                            tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVIP, thoiHanVIP));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return medicalRecords;
    }

    public static void writeMedicalRecords(List<BenhAn> medicalRecords) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (BenhAn benhAn : medicalRecords) {
                StringBuilder sb = new StringBuilder();
                sb.append(benhAn.getSoThuTuBenhAn()).append(CSV_SEPARATOR);
                sb.append(benhAn.getMaBenhAn()).append(CSV_SEPARATOR);
                sb.append(benhAn.getMaBenhNhan()).append(CSV_SEPARATOR);
                sb.append(benhAn.getTenBenhNhan()).append(CSV_SEPARATOR);
                sb.append(benhAn.getNgayNhapVien()).append(CSV_SEPARATOR);
                sb.append(benhAn.getNgayRaVien() != null ? benhAn.getNgayRaVien() : "").append(CSV_SEPARATOR);
                sb.append(benhAn.getLyDoNhapVien()).append(CSV_SEPARATOR);
                if (benhAn instanceof BenhAnThuong) {
                    sb.append(((BenhAnThuong) benhAn).getPhiNamVien());
                } else if (benhAn instanceof BenhAnVIP) {
                    sb.append(((BenhAnVIP) benhAn).getLoaiVIP()).append(CSV_SEPARATOR);
                    sb.append(((BenhAnVIP) benhAn).getThoiHanVIP());
                }
                bw.write(sb.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}