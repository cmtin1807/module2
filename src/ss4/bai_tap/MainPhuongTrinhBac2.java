package ss4.bai_tap;
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
class PhuongTrinhBac2 {
        double a, b, c;

        public PhuongTrinhBac2(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double delta() {
            return b * b - 4 * a * c;
        }

        public String nghiem() {
            double d = delta();
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                return "Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2;
            } else if (d == 0) {
                double x = -b / (2 * a);
                return "Phương trình có nghiệm kép: x = " + x;
            } else {
                return "Phương trình vô nghiệm";
            }
        }
    }

