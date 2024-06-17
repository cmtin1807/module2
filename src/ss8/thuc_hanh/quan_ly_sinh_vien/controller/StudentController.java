package ss8.thuc_hanh.quan_ly_sinh_vien.controller;

import ss8.thuc_hanh.quan_ly_sinh_vien.model.Student;
import ss8.thuc_hanh.quan_ly_sinh_vien.service.IStudentService;
import ss8.thuc_hanh.quan_ly_sinh_vien.service.StudentService;
import ss8.thuc_hanh.quan_ly_sinh_vien.view.ViewStudent;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    // chay chuong trinh
    public static void main(String[] args) {
        showStudentMenu();
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void showStudentMenu() {
        StudentService studentService = new StudentService();
        while (true) {
            System.out.println("Chon chuc nang");
            System.out.println("1.Hien thi");
            System.out.println("2.them moi");
            System.out.println("3.Delete");
            System.out.println("4.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // hien thi
                    Student[] studentList = studentService.findAll();
                    ViewStudent.showListStudent(studentList);
                    break;
                case 2:
                    // them moi
                    Student student = ViewStudent.inputDataStudent();
                    studentService.addStudent(student);
                    System.out.println("Them moi thanh cong");
                    break;
                case 3:
                    // xoa
                    System.out.println("Xoa theo id");
                    int inInput = ViewStudent.inputId();
                    Student deleteStudent = studentService.findById(inInput);
                    if (deleteStudent ==null){
                        System.out.println("Id khong ton tai");
                    }else {
                        studentService.deleteById(inInput);
                        System.out.println("Xoa thanh cong");
                    }
                    break;

                default:
                    // hien thij
                    System.exit(0);
                    break;
            }
        }

    }
}
