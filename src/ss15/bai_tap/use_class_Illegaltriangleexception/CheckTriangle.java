package ss15.bai_tap.use_class_Illegaltriangleexception;

public class CheckTriangle {
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleExeption {
        if (a <0 || b <0 || c < 0 || a+b <= c || b+c <= a || a+c <= b) {
            throw new IllegalTriangleExeption("Khong Phai la 3 canh tam giac");
        }
        System.out.println("La tam giac co 3 canh: "+ a+ ","+b+ ","+c);

    }
}
