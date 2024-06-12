package ss4.bai_tap.phuong_trinh_bac2;
import java.util.Scanner;

public class MainPhuongTrinhBac2 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào giá trị a: ");
        a = sc.nextDouble();
        System.out.print("Nhập vào giá trị b: ");
        b = sc.nextDouble();
        System.out.print("Nhập vào giá trị c: ");
        c = sc.nextDouble();
        PhuongTrinhBac2 phuongTrinhBac2 = new PhuongTrinhBac2(a, b, c);
        System.out.println(phuongTrinhBac2.nghiem());
    }
}
