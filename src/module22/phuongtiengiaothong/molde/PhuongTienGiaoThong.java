package module22.phuongtiengiaothong.molde;

public abstract class PhuongTienGiaoThong {
    public String bienKiemSoat;
    protected String hangSanXuat;
    protected int namSanXuat;
    protected String chuSoHuu;

    public PhuongTienGiaoThong(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public abstract void hienThiThongTin();
    public String toCSVString() {
        return bienKiemSoat + "," + hangSanXuat + "," + namSanXuat + "," + chuSoHuu;
    }
}

