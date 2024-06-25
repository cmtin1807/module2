package ss13.bai_tap.search_big_string;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchBigString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int length = str.length();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < length; j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character c : max) {
            System.out.print(c);
        }
    }
}
