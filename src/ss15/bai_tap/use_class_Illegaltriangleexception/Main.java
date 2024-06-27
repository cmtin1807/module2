package ss15.bai_tap.use_class_Illegaltriangleexception;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ss15.bai_tap.use_class_Illegaltriangleexception.CheckTriangle.checkTriangle;

public class Main {
    public static void main(String[] args) throws IllegalTriangleExeption {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Nhap vao chieu dai canh a: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao chieu dai canh b: ");
        int b = sc.nextInt();
        System.out.println("Nhap vao chieu dai canh c: ");
        int c = sc.nextInt();
        checkTriangle(a,b,c);
        }
        catch (InputMismatchException e){
            System.err.println("Nhap sai kieu du lieu");
        }
        catch(IllegalTriangleExeption e){
            System.err.println(e.getMessage());
        }


    }
}
