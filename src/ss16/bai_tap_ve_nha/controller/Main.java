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
        File file = new File("D:\\codegym\\module2\\src\\ss16\\bai_tap_ve_nha\\data\\data.txt");
        ViewStudent.printAllStudentBegin(file, studentManager);
        while (true) {
            ViewStudent.dislayMenu();
            int choice = scanner.nextInt();
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
                case EXIT:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }



}
