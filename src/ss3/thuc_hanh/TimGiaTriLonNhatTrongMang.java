package ss3.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int[] taiSanTyPhu;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("So ty phu nho hon hoac bang 20: ");
            size = sc.nextInt();
        }
        while (size>20);
        taiSanTyPhu = new int[size];
        for (int i = 0; i < taiSanTyPhu.length; i++) {
            System.out.print("Tai san cua ty phu thu " + (i+1)+": ");
            taiSanTyPhu[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(taiSanTyPhu));
        int max = taiSanTyPhu[0];
        int index = 0;
        for (int i = 1; i < taiSanTyPhu.length; i++) {
            if (taiSanTyPhu[i] > max) {
                max = taiSanTyPhu[i];
                index = i;
            }
        }
        System.out.println("Gia tri lon nhat: "+ max+ " ty nam o vi tri "+ (index+1) );
    }

}
