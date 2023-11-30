package main.java.Assignment.ObjectOrientedProgramming;

import main.java.Assignment.ObjectOrientedProgramming.animals.BaseAnimal;
import main.java.Assignment.ObjectOrientedProgramming.animals.Fish;
import main.java.Assignment.ObjectOrientedProgramming.animals.Lion;
import main.java.Assignment.ObjectOrientedProgramming.animals.Parrot;

public class AnimalsMain {
    public static void main(String[] args) {
        BaseAnimal[] animals = new BaseAnimal[]{
                new Lion("Lion", "land", "roars", "meat"),
                new Parrot("Parrot", "trees", "sings", "fruits"),
                new Fish("Fish", "water", "bubbles", "plankton")
        };

        for (BaseAnimal animal : animals) {
            System.out.println("\n\n" + animal.getAnimalName());
            animal.feature();
            animal.lives();
            animal.eats();
            animal.sounds();
        }
    }
}
