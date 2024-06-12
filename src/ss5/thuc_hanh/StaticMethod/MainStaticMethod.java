package ss5.thuc_hanh.StaticMethod;

public class MainStaticMethod {
    public static void main(String[] args) {
        Student.changeCollege();
        Student s1 = new Student(1, "Nguyen");
        Student s2 = new Student(2, "Quyet");
        Student s3 = new Student(3, "Cong");
        s1.display();
        s2.display();
        s3.display();
    }
}
