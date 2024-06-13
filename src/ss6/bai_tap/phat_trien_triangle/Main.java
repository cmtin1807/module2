package ss6.bai_tap.phat_trien_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1 of the triangle: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the side2 of the triangle: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter the side2 of the triangle: ");
        double side3 = sc.nextDouble();
        System.out.println("Enter the color of the triangle: ");
        String color = sc.next();
        triangle1.setSide1(side1);
        triangle1.setSide2(side2);
        triangle1.setSide3(side3);
        triangle1.setColor(color);
        System.out.println(triangle1);
    }
}
