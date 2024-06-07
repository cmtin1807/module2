package ss3.thuc_hanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
     double doF;
     double doC;
     int choice;
     Scanner sc = new Scanner(System.in);
     do {
         System.out.println("Chương Trình Chuyển Đổi");
         System.out.println("1. Chuyển Đổi Từ Độ C Sang Độ F");
         System.out.println("2. Chuyển Đổi Từ Độ F Sang Độ C");
         System.out.println("0. Exit");
         System.out.println("Nhập vào sự lựa chọn");
         choice = sc.nextInt();
         switch (choice) {
             case 1:
                 System.out.print("Nhâp vào độ C: ");
                 doC = sc.nextDouble();
                 System.out.println("Giá trị độ F là: " + chuyenDoiCSangF(doC));
                 break;
                 case 2:
                     System.out.println("Nhập vào độ F: ");
                     doF = sc.nextDouble();
                     System.out.println("Giá trị độ C là: " + chuyenDoiFSangC(doF));
                     break;
                     case 0:
                         System.exit(0);
                         break;
             default:
                 System.out.println("Vui lòng nhập lại: ");

         }

     }
     while (choice>2);
    }
    public static double chuyenDoiCSangF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }
    public static double chuyenDoiFSangC(double doF) {
        double doC = (5.0 / 9) * ( doF - 32);
        return doC;
    }
    }

