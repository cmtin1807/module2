package ss6.bai_tap.circle_vs_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4, "red");
        Cylinder cilinder = new Cylinder(5);
        cilinder.setRadius(3);
        cilinder.setColor("blue");
        System.out.println(circle);
        System.out.println(cilinder);
    }
}
