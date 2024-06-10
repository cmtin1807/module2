package ss3.bai_tap;

import java.util.Scanner;

public class XoaPhanTu2 {
    public static void main(String[] args) {
        int [] array = {3,5,7,8,2,4,6,9};
        int index = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten phan tu muon xoa");
        int n = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                index = i;
                break;
            }
        }
        int [] newArray = new int[array.length-1];
        for (int i = 0, j = 0; i < array.length; i++,j++) {
            if (i == index) {
                j--;
                continue;
            }
            newArray[j] = array[i];
        }
        System.out.printf("%-30s","Mang moi la: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}

