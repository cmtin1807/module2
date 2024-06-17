package ss8.thuc_hanh.quan_ly_sinh_vien.service;

import ss8.thuc_hanh.quan_ly_sinh_vien.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService{
    private static  Student[] studentList = new Student[100];
    static {
        studentList[0]=(new Student(1,"chanh1"));
        studentList[1]=(new Student(2,"chanh2"));
    }
    @Override
    public  Student[] findAll() {
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]==null){
                studentList[i]=student;
                break;
            }
        }
    }

    @Override
    public Student findById(int id) {
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]!=null){
                if (studentList[i].getId()==id){
                    return  studentList[i];
                }
            }

        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i].getId()==id){
               studentList[i]=null;
               break;
            }
        }
    }
}
