package main.java.abstract_practice.use;

public class Dog extends AnimalAbstract {
    public Dog() {
        this.cry = "멍멍~";
    }

    @Override
    public void sound() {
        super.sound();
    }
}
