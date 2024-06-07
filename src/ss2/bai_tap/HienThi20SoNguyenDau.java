package ss2.bai_tap;

public class HienThi20SoNguyenDau {
    public static void main(String[] args) {
        int index = 1;
        System.out.println("2");
        int x = 3;
        while (index < 20 ){
            boolean kq = true;
            for (int i = 2; i <= Math.sqrt(x) ; i++) {
                if (x % i == 0) {
                    kq = false;
                    break;
                }
            }
            if (kq) {
                System.out.println(x);
                index++;}
            x++;
        }


    }
}
