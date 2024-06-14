package ss7.bai_tap.trien_khai_interface_colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        shape[0] = new Rectangle(4, 5);
        shape[1] = new Square(5);
        shape[2] = new Circle(2);
        shape[3] = new Square(10);
        for (Shape color : shape) {
            System.out.println(color.getArea());
            if (color instanceof Colorable) {
                Colorable colorable = (Colorable) color;
                System.out.println(colorable.howToColor());
            }



//            Cách2:
//            if (color instanceof Rectangle) {
//                Rectangle rectangle = (Rectangle) color;
//                System.out.println("Diện tích hình chữ nhật= " + rectangle.getArea());
//            }
//            if (color instanceof Square) {
//                Square square = (Square) color;
//                System.out.print("Diện tích hình vuông= " + square.getArea());
//                System.out.println("\t"+square.howToColor());
//            }
//            if (color instanceof Circle) {
//                Circle circle = (Circle) color;
//                System.out.println("Diện tích hình tròn= " + Circle.getArea());
//            }
        }
    }
}
