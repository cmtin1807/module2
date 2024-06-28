package ss17.thuc_hanh.read_write_binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        try {
            FileOutputStream fos = new FileOutputStream("src/ss17/thuc_hanh/read_write_binary/student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student> students1 = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("src/ss17/thuc_hanh/read_write_binary/student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            students1 = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        List<Student> studentDataFromFile = students1;
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }

}
