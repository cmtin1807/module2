package ss16.thuc_hanh_test.test_file_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        try {
            File file = new File("src//ss16//Hello.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String name = scanner.next();
                String firstName = scanner.next();
                int age = scanner.nextInt();
                System.out.println(name + " " + firstName + " " + age);

            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException();
        }
    }
}
