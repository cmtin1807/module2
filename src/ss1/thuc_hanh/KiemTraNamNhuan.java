package ss1.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao nam can kiem tra: ");
        int nam = scanner.nextInt();
        if (nam%4==0){
            if (nam%100==0 && nam%400!=0){
                System.out.println("Nam " + nam + " khong phai la nam nhuan");
            }
            else {
                System.out.println("Nam " + nam + " la nam nhuan");
            }
        }
        else {
            System.out.println("Nam " + nam + " khong phai la nam nhuan");
        }
    }
}
