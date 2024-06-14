package ss7.bai_tap.trien_khai_interface_resizeaable;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[5];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(5);
        shapes[3] = new Circle(7);
        shapes[4] = new Rectangle(10, 20);
        for (Resizeable shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                double resizePercent = Math.random() * 100;
                System.out.println("Area before resize: " + circle.getArea());
                shape.resize(resizePercent);
                System.out.println("Percent= " + resizePercent + " Area after resize: " + circle.getArea());
            }
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                double resizePercent = Math.random() * 100;
                System.out.println("Area before resize: " + rectangle.getArea());
                shape.resize(resizePercent);
                System.out.println("Percent= " + resizePercent + " Area after resize: " + rectangle.getArea());
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                double resizePercent = Math.random() * 100;
                System.out.println("Area before resize: " + square.getArea());
                shape.resize(resizePercent);
                System.out.println("Percent= " + resizePercent + " Area after resize: " + square.getArea());
            }
        }
    }
}

