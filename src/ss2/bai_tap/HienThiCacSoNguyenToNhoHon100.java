package ss2.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int index = 1;
        System.out.println("1: 2");
        int x = 3;
        while (x < 100) {
            boolean kq = true;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    kq = false;
                    break;
                }
            }
            if (kq) {
                index++;
                System.out.println(index +": "+x);

            }
            x++;
        }
    }
}
