package ss11.bai_tap.parenthes_is_checker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (ParenthesIsChecker.checkString(str)){
            System.out.println("Well");
        }
        else
        {
            System.out.println("No");
        }
    }
}
