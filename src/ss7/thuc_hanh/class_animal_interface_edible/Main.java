package ss7.thuc_hanh.class_animal_interface_edible;

import ss7.thuc_hanh.class_animal_interface_edible.animal.Animal;
import ss7.thuc_hanh.class_animal_interface_edible.animal.Chicken;
import ss7.thuc_hanh.class_animal_interface_edible.animal.Tiger;
import ss7.thuc_hanh.class_animal_interface_edible.fruit.Apple;
import ss7.thuc_hanh.class_animal_interface_edible.fruit.Fruit;
import ss7.thuc_hanh.class_animal_interface_edible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Chicken chicken = (Chicken) animal;
                System.out.println(chicken.howToEat());
            }

        }
        Fruit [] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit f : fruit) {
            System.out.println(f.howToEat());
        }

    }
}
