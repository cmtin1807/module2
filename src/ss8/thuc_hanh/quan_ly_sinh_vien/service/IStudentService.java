package ss8.thuc_hanh.quan_ly_sinh_vien.service;

import ss8.thuc_hanh.quan_ly_sinh_vien.model.Student;

import java.util.List;

public interface IStudentService {
    Student[] findAll();
    void  addStudent (Student student);
    Student findById(int id);
    void deleteById(int id);
}
