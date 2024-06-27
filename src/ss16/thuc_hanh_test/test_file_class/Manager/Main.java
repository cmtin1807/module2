package ss16.thuc_hanh_test.test_file_class.Manager;


import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent= new ManagerStudent();

        try{
            File file = new File("src//ss16//thuc_hanh_test//test_file_class//Manager//Hellodadcac.txt");
            try{
                if (!file.exists()){
                    throw new FileNotFoundException("File not found....");
                }
            }
            catch (FileNotFoundException e){
                System.err.println(e.getMessage());
            }
            FileWriter fw = new FileWriter(file,true);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter fName: ");
            String fName = sc.nextLine();
            System.out.println("Enter lName: ");
            String lName = sc.nextLine();
            System.out.println("Enter age: ");
            int age1 = sc.nextInt();
            String data = "\n"+  fName + " " + lName + " " + age1;
            fw.write(data);
            fw.close();
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
