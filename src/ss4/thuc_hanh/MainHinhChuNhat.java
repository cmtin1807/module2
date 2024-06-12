package ss4.thuc_hanh;

import java.util.Scanner;

public class MainHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị chiều ngang: ");
        double ngang = sc.nextDouble();
        System.out.print("Nhập giá trị chiều dọc: ");
        double doc = sc.nextDouble();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(ngang, doc);
        System.out.println("Hình chữ nhật của bạn: \n" + hinhChuNhat.getHienThi());
        System.out.println("Diện tích hình chữ nhật của bạn là: " + hinhChuNhat.getDienTich());
        System.out.println("Chu vi hình chữ nhật của bạn là: " + hinhChuNhat.getChuVi());
    }
}
class HinhChuNhat {
    double ngang;
    double doc;
    public HinhChuNhat(double ngang, double doc) {
        this.ngang = ngang;
        this.doc = doc;
    }

    public double getDienTich() {
        return ngang * doc;
    }

    public double getChuVi() {
        return (ngang + doc) * 2;
    }

    public String getHienThi() {
        return "HinhChuNhat{ ngang = " + ngang + ", doc = " + doc + "}";
    }
}