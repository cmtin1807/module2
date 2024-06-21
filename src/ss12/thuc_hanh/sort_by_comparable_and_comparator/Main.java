package ss12.thuc_hanh.sort_by_comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyen",11,"quang nam");
        Student student2 = new Student("Quyet",9,"quang ngai");
        Student student3 = new Student("Cong",10,"hue");
        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        NameComparator nameComparator = new NameComparator();
        Collections.sort(students, nameComparator);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
