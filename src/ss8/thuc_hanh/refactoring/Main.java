package ss8.thuc_hanh.refactoring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first operand: ");
        int firstOperand = sc.nextInt();

        System.out.println("Enter second operand: ");
        int secondOperand = sc.nextInt();

        System.out.println("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        try {
            int result = Calculator.calculate(firstOperand, secondOperand, operator);
            System.out.println("The result is: " + result);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
