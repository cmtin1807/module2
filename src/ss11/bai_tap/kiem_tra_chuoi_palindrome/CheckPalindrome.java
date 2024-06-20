package ss11.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String palindrome = sc.nextLine();
        System.out.println(palindrome);
        String[] words = palindrome.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            stack.push(lowercaseWord);
            queue.add(lowercaseWord);
        }
        System.out.println(stack);
        System.out.println(queue);
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if ((stack.pop()).equals(queue.poll())){
                count++;
            }
        }
        if (count == words.length){
            System.out.println("Đây là chuỗi palindrome");
        }
        else {
            System.out.println("Đây là không phải chuỗi palindrome");
        }
    }
}
