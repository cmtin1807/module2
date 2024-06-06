package ss1.bai_tap;

import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri USD: ");
        float USD = scanner.nextFloat();
        float quyDoi = USD*25000;
        System.out.print("Gia tri VND: " + quyDoi);
    }

}
