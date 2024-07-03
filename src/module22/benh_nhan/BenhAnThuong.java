package module22.benh_nhan;

import java.time.LocalDate;

public class BenhAnThuong extends BenhAn {
    private long phiNamVien; // đơn vị VNĐ

    public BenhAnThuong(int soThuTuBenhAn, String maBenhAn, String maBenhNhan, String tenBenhNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, long phiNamVien) {
        super(soThuTuBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }


    @Override
    public String loaiBenhAn() {
        return "Bệnh án thường";
    }

    public long getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(long phiNamVien) {
        this.phiNamVien = phiNamVien;
    }
}
