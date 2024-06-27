package ss16.thuc_hanh_test.test_file_class.Manager;

import java.util.ArrayList;
import java.util.List;

public class ManagerStudent {
    private List<Student> managerStudent;

    public ManagerStudent() {
        managerStudent = new ArrayList<Student>();
    }
    public Student add(Student student) {
        managerStudent.add(student);
        return student;
    }
    public void printAll(){
        for (int i = 0; i < managerStudent.size(); i++) {
            System.out.println(managerStudent.get(i));
        }
    }

}
