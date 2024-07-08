package kien_thuc.map;


import java.util.HashMap;
import java.util.Map;

public class TextMap {
    public static void main(String[] args) {
        Map<Integer, Person> personMap = new HashMap<>();

        // Thêm các đối tượng Person vào Map
        Person person1 = new Person(1, "Alice", 25);
        Person person2 = new Person(2, "Bob", 30);
        Person person3 = new Person(3, "Charlie", 28);

        personMap.put(person1.getId(), person1);
        personMap.put(person2.getId(), person2);
        personMap.put(person3.getId(), person3);

        // Duyệt qua các phần tử của Map và in ra thông tin của từng Person
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            int id = entry.getKey();
            Person person = entry.getValue();
            System.out.println(id + ":" + person.getName() + " " + person.getAge());
        }
        System.out.println(personMap.entrySet());
    }

    static class Person {
        private int id;
        private String name;
        private int age;

        public Person(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

