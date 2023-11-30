package main.java.abstract_practice.use;

public class Cow extends AnimalAbstract{
    public Cow() {
        this.cry = "음머~";
    }

    @Override
    public void sound() {
        super.sound();
    }
}
