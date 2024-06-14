package ss31Test.bai_tap.Test;

public class Main {
    public static void main(String[] args) {
        Shape[]shapes = new Shape[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(5,5);
        shapes[3] = new Circle(10);
        shapes[4] = new Square(10);
        for (Shape shape : shapes) {
            if (shape instanceof Resizeable) {
                System.out.println("Dien Tich Ban Dau= "+ shape.getArea());
                Resizeable resizeable = (Resizeable) shape;
                double changPercent = Math.random()*100;
                shape.resize(changPercent);
                System.out.println("changPercent= "+ changPercent);
                System.out.println("Dien Tich Sau Do= "+ shape.getArea());
            }
        }
        for (Shape shape1 : shapes) {
            System.out.println(shape1);
        }
    }
}
