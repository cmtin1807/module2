package ss7.bai_tap.trien_khai_interface_colorable;


import ss7.bai_tap.trien_khai_interface_colorable.Rectangle;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of Rectangle, "
                + "with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }


    @Override
    public String howToColor() {
        return "Color all four sides.";
    }
}
