package module22.phuongtiengiaothong.molde;

public class Oto extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuXe;

    public Oto(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Ôtô - Biển số: " + bienKiemSoat + ", Hãng sản xuất: " + hangSanXuat +
                ", Năm sản xuất: " + namSanXuat + ", Chủ sở hữu: " + chuSoHuu +
                ", Số chỗ ngồi: " + soChoNgoi + ", Kiểu xe: " + kieuXe);
    }

    @Override
    public String toCSVString() {
        return super.toCSVString() + "," + soChoNgoi + "," + kieuXe;
    }
}
