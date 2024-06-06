package ss1.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args){
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = scanner.nextFloat();
        System.out.print("Nhap b: ");
        b = scanner.nextFloat();
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            System.out.println("Phuong trinh co nghiem la: " + b/a);
        }
    }
}
