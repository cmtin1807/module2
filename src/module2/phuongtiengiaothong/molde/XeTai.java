package module2.phuongtiengiaothong.molde;

public class XeTai extends PhuongTienGiaoThong {
    private int trongTai;

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Xe tải - Biển số: " + bienKiemSoat + ", Hãng sản xuất: " + hangSanXuat +
                ", Năm sản xuất: " + namSanXuat + ", Chủ sở hữu: " + chuSoHuu +
                ", Trọng tải: " + trongTai);
    }

    @Override
    public String toCSVString() {
        return super.toCSVString() + "," + trongTai;
    }
}
