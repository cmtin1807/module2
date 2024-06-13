package ss6.bai_tap.point_vs_moveablepoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        MoveablePoint mP1 = new MoveablePoint(3,4);
        System.out.println(p1);
        mP1.setX(3);
        mP1.setY(3);
        System.out.println(mP1);
        System.out.println(Arrays.toString(mP1.move()));
    }
}
