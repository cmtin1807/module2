package ss7.thuc_hanh.trien_khai_interface_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            ComparableCircle[] circles = new ComparableCircle[3];
            circles[0] = new ComparableCircle(3.7);
            circles[1] = new ComparableCircle();
            circles[2] = new ComparableCircle(3.6, "indigo", true);

            System.out.println("Pre-sorted:");
            for (ComparableCircle circle : circles) {
                System.out.println(circle);
            }

            Arrays.sort(circles);

            System.out.println("After-sorted:");
            for (ComparableCircle circle : circles) {
                System.out.println(circle);
            }
        }
}
