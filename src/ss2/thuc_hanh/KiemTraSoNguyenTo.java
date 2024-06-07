package ss2.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        int A;
        Scanner scanner = new Scanner(System.in);
        System.out.println("So can check");
        A = scanner.nextInt();
        boolean index = true;
        for (int i = 2; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                index = false;
                break;
            }
        }
        if (index) {
            System.out.println(A + " Là số nguyên tố");
        }
        else {
            System.out.println(A + " Không phải là số nguyên tố");
        }
    }
}
