package ss2.thuc_hanh;

import java.util.Scanner;

public class TinhLaiSuatNganHang {
    public static void main(String[] args) {
        int month;
        int tienGui;
        float tienLai;
        float laiSuat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien gui");
        tienGui = sc.nextInt();
        System.out.println("Nhap so lai suat");
        laiSuat = sc.nextFloat();
        System.out.println("Nhap so thang gui");
        month = sc.nextInt();
        tienLai = tienGui*(laiSuat/100)/12 * month;
        System.out.println("Tien lai duoc nhan la: " + tienLai );

    }
}
