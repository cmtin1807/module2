package module22.phuongtiengiaothong.molde;

public class XeMay extends PhuongTienGiaoThong {
    private int congSuat;

    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Xe máy - Biển số: " + bienKiemSoat + ", Hãng sản xuất: " + hangSanXuat +
                ", Năm sản xuất: " + namSanXuat + ", Chủ sở hữu: " + chuSoHuu +
                ", Công suất: " + congSuat);
    }

    @Override
    public String toCSVString() {
        return super.toCSVString() + "," + congSuat;
    }
}
