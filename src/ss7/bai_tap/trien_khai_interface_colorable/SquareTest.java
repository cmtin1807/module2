package ss7.bai_tap.trien_khai_interface_colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(2, "green", true);
        square.setSide(5);
        System.out.println(square.getArea());
    }
}
