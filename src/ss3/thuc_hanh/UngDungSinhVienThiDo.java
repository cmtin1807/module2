package ss3.thuc_hanh;

import java.util.Scanner;

public class UngDungSinhVienThiDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[]diem;
        int soLuongDo = 0;
        do{
            System.out.print("Nhap so luong hoc sinh toi da 30: ");
            size = sc.nextInt();
        }
        while(size > 30);
        diem = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Nhap diem cua hoc sinh thu "+(i+1)+": ");
            int value = sc.nextInt();
            diem[i] = value;
        }
        System.out.printf("%-40s", "Danh sach diem cua hoc sinh la: ");
        for(int i = 0; i < size; i++){
            System.out.print(diem[i]+ "  ");
        }
        for(int i = 0; i < size; i++){
            if(diem[i]>=5){
                soLuongDo++;
            }
        }
        System.out.println();
        System.out.printf("%-40s", "So luong hoc sinh thi do la: ");
        System.out.print(soLuongDo);
    }
}
