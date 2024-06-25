package ss13.thuc_hanh.tinh_do_phuc_tap;

import java.util.Arrays;

public class AlgorithmComplexity {
    public static void algorithmComplexity(String input) {
        int [] chars = new int[255];//1
        for (int i = 0; i < input.length(); i++) {
            int value = input.charAt(i);// input.leng() lần = N lần
            chars[value]++;// input.leng() lần
        }
        int max = 0;    //1 lần
        int index = 0; // 1 lần
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > max) { //255 lần
                max = chars[i];//255 lần
                index = i;//255 lần
            }
        }
        char charss = (char) index; // 1 lần
        System.out.println("Ky tu lap lai nhiu nhat la: "+ charss+" voi so lan la: " +max);
    }
}
// tổng = 4 + 255x3 + 2xN
// nếu N < 255 thì tổng = 4+4N+255