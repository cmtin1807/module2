package ss16.bai_tap_ve_nha.controller;

import ss16.bai_tap_ve_nha.model.Student;
import ss16.bai_tap_ve_nha.service.StudentManager;
import ss16.bai_tap_ve_nha.view.ViewStudent;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static ss16.bai_tap_ve_nha.view.IViewStudent.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\codegym\\module2\\src\\ss16\\bai_tap_ve_nha\\data\\data.txt";
        while (true) {
            File file = new File(path);
            ViewStudent.printAllStudentBegin(file, studentManager);
            boolean menu = true;
            while (menu) {
                ViewStudent.dislayMenu();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case ADD_STUDENT:
                        ViewStudent.addStudentInStudentManager(file, studentManager, scanner);
                        break;
                    case UPDATE_STUDENT:
                        ViewStudent.updateStudentInStudentManager(scanner, file);
                        break;
                    case DELETE_STUDENT:
                        ViewStudent.removeStudentInStudentManager(scanner, file);
                        break;
                    case DISPLAY_STUDENT:
                        ViewStudent.diplayAllStudentInStudentManager(file, studentManager);
                        break;
                    case IMPORT_FILE:
                        menu = false;
                        break;
                    case EXPORT_FILE:
                        ViewStudent.exportFile(scanner, file);
                        break;

                    case EXIT:
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice");
                }
            }
            if (!menu){
                System.out.println("Enter Import students from file: ");
                path = scanner.nextLine();}
            }
        }
}



