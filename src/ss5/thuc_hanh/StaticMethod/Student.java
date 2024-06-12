package ss5.thuc_hanh.StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "Nguyen";
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void changeCollege(){
        college = "CodeGym";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
