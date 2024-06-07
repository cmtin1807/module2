package ss3.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[]student = {"Chien", "Thanh","Cong","Quyet","Tu","Hieu", "Nguyen"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tim: ");
        String tim = sc.nextLine();
        boolean co = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(tim)) {
                co = true;
                System.out.println(" Ten can tim "+tim+" nam o vi tri " + i  );
                break;
            }
        }
        if (!co){
            System.out.println("Khong tim thay "+ tim);
    }}}

