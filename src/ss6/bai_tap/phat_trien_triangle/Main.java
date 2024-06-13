package ss6.bai_tap.phat_trien_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle1 = new Triangle();
        boolean isValidTriangle = false;

        do {
            System.out.println("Enter the side 1 of the triangle: ");
            double side1 = sc.nextDouble();
            System.out.println("Enter the side 2 of the triangle: ");
            double side2 = sc.nextDouble();
            System.out.println("Enter the side 3 of the triangle: ");
            double side3 = sc.nextDouble();

            if (Triangle.isValidTriangle(side1, side2, side3)) {
                isValidTriangle = true;
                System.out.println("Enter the color of the triangle: ");
                String color = sc.next();
                triangle1.setSide1(side1);
                triangle1.setSide2(side2);
                triangle1.setSide3(side3);
                triangle1.setColor(color);
            } else {
                System.out.println("Invalid triangle! Please enter valid side lengths.");
            }
        } while (!isValidTriangle);

        System.out.println(triangle1);
    }
}