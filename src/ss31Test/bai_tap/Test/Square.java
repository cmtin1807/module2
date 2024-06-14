package ss31Test.bai_tap.Test;

public class Square extends Rectangle{
    public Square() {}
    public Square(double side) {
        super(side, side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return getLength();
    }
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
