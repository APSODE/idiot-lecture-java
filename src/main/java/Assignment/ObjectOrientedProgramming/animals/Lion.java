package main.java.Assignment.ObjectOrientedProgramming.animals;

public class Lion extends BaseAnimal {
    public Lion(String animalName, String animalHabitat, String animalSound, String animalFood) {
        super(animalName, animalHabitat, animalSound, animalFood);
    }

    @Override
    public void lives() {
        System.out.println(this.animalName + " lives on " + this.animalHabitat);
    }

    @Override
    public void eats() {
        System.out.println(this.animalName + " eats " + this.animalFood);
    }

    @Override
    public void sounds() {
        System.out.println(this.animalName + " " +this.animalSound);
    }

    @Override
    public void feature() {
        System.out.println(this.animalName + " is a wild animal");
    }
}
