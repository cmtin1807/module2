package ss8.thuc_hanh.quan_ly_sinh_vien.view;

import ss8.thuc_hanh.quan_ly_sinh_vien.model.Student;

import java.util.Scanner;

public class ViewStudent {
    static Scanner scanner = new Scanner(System.in);
    public static void showListStudent(Student[] studentList){
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]!=null){
                System.out.println(studentList[i]);
            }else {
                break;
            }
        }
    }
    public static Student inputDataStudent(){
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        Student student = new Student(id,name);
        return student;
    }
    public static int inputId(){
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }
}
