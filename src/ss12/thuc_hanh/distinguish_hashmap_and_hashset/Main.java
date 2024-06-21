package ss12.thuc_hanh.distinguish_hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("nguyen", 27,"quang nam");
        Student student2 = new Student("quyet", 30,"quang ngai");
        Student student3 = new Student("cong", 20,"hue");
        System.out.println("1. HashMap");
        Map <Integer,Student> hashMap = new HashMap<Integer, Student>();
        hashMap.put(1,student1);
        hashMap.put(2,student2);
        hashMap.put(3,student3);
        hashMap.put(3,student1);
        for (Map.Entry<Integer,Student> student : hashMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("2. HashSet");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student3);
        for (Student student : students){
            System.out.println(student.toString());
        }




    }
}
