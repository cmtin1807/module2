package ss7.thuc_hanh.trien_khai_interface_comparator;

import java.util.Comparator;

public class ColorComparator implements Comparator<Circle> {
    public int compare(Circle o1, Circle o2) {
        String color1 = o1.getColor();
        String color2 = o2.getColor();
        return color1.compareTo(color2);
    }
}
