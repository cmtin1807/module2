package ss2.thuc_hanh;

import java.util.Scanner;

public class TinhTongAB {
    public static void main(String[] args) {
        int A,B;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap so A");
            A = sc.nextInt();
            System.out.println("Nhap so B");
            B = sc.nextInt();
        }
        while (A>=B);
        for(int i=A;i<=B;i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}
