package ss13.thuc_hanh.tinh_do_phuc_tap;

import java.util.Arrays;
import java.util.Scanner;

import static ss13.thuc_hanh.tinh_do_phuc_tap.AlgorithmComplexity.algorithmComplexity;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input String: ");
        String input = sc.nextLine();
        algorithmComplexity(input);


    }


}
