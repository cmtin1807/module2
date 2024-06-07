package ss2.thuc_hanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a");
        a = sc.nextInt();
        System.out.println("Nhap so b");
        b = sc.nextInt();
        int ucln = UCLN(a,b);
        System .out.println(ucln);
    }
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
