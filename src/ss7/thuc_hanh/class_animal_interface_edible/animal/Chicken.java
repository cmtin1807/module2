package ss7.thuc_hanh.class_animal_interface_edible.animal;

import ss7.thuc_hanh.class_animal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: Cuccu";
    }

    @Override
    public String howToEat() {
        return "Chicken could be fried";
    }
}
