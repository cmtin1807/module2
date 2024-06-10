package ss3.bai_tap;

import java.util.Scanner;
import java.lang.String;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String chuoi = "nguyenducthaonguyen";
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ky tu can tim");
        String kyTu = sc.nextLine();
        System.out.println(chuoi.length());
        for (int i = 0; i < chuoi.length(); i++) {
            if ((String.valueOf(chuoi.charAt(i))).equals(kyTu)) {
                dem++;
            }
        }
        System.out.println(dem);
    }
}
