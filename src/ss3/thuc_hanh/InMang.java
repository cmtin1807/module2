package ss3.thuc_hanh;


import java.util.Arrays;
import java.util.Scanner;

public class InMang {
    public static void main(String[] args) {
        double[][] arr = new double[2][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter coordinates of " + i + "x" + j + ": ");
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.print(Arrays.deepToString(arr));
    }
}
