package ss11.bai_tap.dao_nguoc_phan_tu_bang_stack;

import java.util.Stack;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
    private static void stackOfIntegers() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.1. Size of stack after push operations: " + stack.size());
        System.out.printf("%-30s","1.2. List elements from stack : ");
        for (Integer s : stack) {
            System.out.print(s + "\t");
        }
        Stack<Integer> stack2 = new Stack<>();
        for( int i = stack.size() - 1; i >= 0; i-- ) {
            stack2.push(stack.pop());
        }
        System.out.println("\n1.3. Size of stack after push operations: " + stack2.size());
        System.out.printf("%-30s","1.4. List elements from stack : ");
        for (Integer s : stack2) {
            System.out.print(s + "\t");
        }
    }
    private static void stackOfIStrings() {
        Stack<String> stack = new Stack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("%-30s","2.2. List elements from stack : ");
        for (String s : stack) {
            System.out.print(s + "\t");
        }
        Stack<String> stack2 = new Stack<>();
        for( int i = stack.size() - 1; i >= 0; i-- ) {
            stack2.push(stack.pop());
        }
        System.out.println("\n2.3. Size of stack after push operations: " + stack2.size());
        System.out.printf("%-30s","2.4. List elements from stack : ");
        for (String s : stack2) {
            System.out.print(s + "\t");
        }
    }


}
