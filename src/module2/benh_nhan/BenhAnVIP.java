package module2.benh_nhan;

import java.time.LocalDate;

public class BenhAnVIP extends BenhAn {
    private LoaiVIP loaiVIP;
    private LocalDate thoiHanVIP;

    public BenhAnVIP(int soThuTuBenhAn, String maBenhAn, String maBenhNhan, String tenBenhNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, LoaiVIP loaiVIP, LocalDate thoiHanVIP) {
        super(soThuTuBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVIP = loaiVIP;
        this.thoiHanVIP = thoiHanVIP;
    }

    @Override
    public String loaiBenhAn() {
        return "Bệnh án VIP";
    }

    public LoaiVIP getLoaiVIP() {
        return loaiVIP;
    }

    public void setLoaiVIP(LoaiVIP loaiVIP) {
        this.loaiVIP = loaiVIP;
    }

    public LocalDate getThoiHanVIP() {
        return thoiHanVIP;
    }

    public void setThoiHanVIP(LocalDate thoiHanVIP) {
        this.thoiHanVIP = thoiHanVIP;
    }
}
