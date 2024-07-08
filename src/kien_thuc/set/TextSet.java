package kien_thuc.set;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TextSet {
    public static void main(String[] args) {
        Set<Person> personSet = new LinkedHashSet<>();


        Person person1 = new Person(1, "Công", 25);
        Person person2 = new Person(2, "Đi", 30);
        Person person3 = new Person(3, "Ngủ", 38); // ID trùng với person1

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        for (Person person : personSet) {
            System.out.println(person.getId() + ", " + person.getName() + ", " + person.getAge());
        }
    }
}

