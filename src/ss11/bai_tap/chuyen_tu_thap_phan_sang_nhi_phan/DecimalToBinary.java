package ss11.bai_tap.chuyen_tu_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can chuyen doi: ");
        int s = sc.nextInt();
        toBinary(s);
    }
    public static void toBinary(int number){
        Stack<Integer> stack = new Stack<>();
        if (number == 0){
            System.out.println("0");;
        }
        while(number != 0){
            stack.push(number%2);
            number = (int) number/2;
        }
        for (int i = stack.size() - 1; i >= 0; i--){
            System.out.print(stack.pop());
        }


    }
}
