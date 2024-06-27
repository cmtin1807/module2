package ss16.thuc_hanh_test.test_file_class.Manager;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent= new ManagerStudent();

        try{
            File file = new File("src//ss16//thuc_hanh_test//test_file_class//Manager//Hellodadcac.txt");
            System.out.println(file.exists());

            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String fistName = scanner.next();
                String lastName = scanner.next();
                int age = scanner.nextInt();
                if (scanner.hasNextLine()){
                    scanner.nextLine();
                }
                managerStudent.add(new Student(fistName, lastName, age));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        managerStudent.printAll();

    }
}
