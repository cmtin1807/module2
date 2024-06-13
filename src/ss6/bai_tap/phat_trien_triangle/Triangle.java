package ss6.bai_tap.phat_trien_triangle;

public class Triangle extends Shape {
    protected double side1 = 1.0d;
    protected double side2 = 1.d;
    protected double side3 = 1.0d;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "mau=" + super.getColor() +
                ", dien tich =" + getArea() +
                ", chu vi=" + getPerimeter() +
                '}';
    }
}
