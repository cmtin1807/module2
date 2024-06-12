package ss4.bai_tap.Fan;

public class MainFan {
    public static void main(String[] args) {
        QuanLyFan quanLyFan = new QuanLyFan(10);
        Fan fan1 = new Fan(1000, true , 2d,"" );
        Fan fan2 = new Fan(2000, false, 3d, "blue");
        quanLyFan.themFan(fan1);
        quanLyFan.themFan(fan2);
        quanLyFan.hienThiQuanLyFan();

    }
}

