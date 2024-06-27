package ss16.thuc_hanh_test.test_file_class;

import java.io.File;
import java.util.Scanner;

public class TestHoatDongScanner {
    public static void main(String[] args) {
        try {
            File file = new File("src//ss16//Hellodadcac.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                int intValue = scanner.nextInt();
                System.out.print(intValue);
                String line = scanner.nextLine();
                System.out.print(line);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
