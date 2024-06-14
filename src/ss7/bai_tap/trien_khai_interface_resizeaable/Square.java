package ss7.bai_tap.trien_khai_interface_resizeaable;

import ss7.bai_tap.trien_khai_interface_resizeaable.Rectangle;

public class Square extends Rectangle implements Resizeable {
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
    public void resize(double percent) {
        double newSide = getSide() * (1 + percent / 100); //
        setSide(newSide);
    }
}
