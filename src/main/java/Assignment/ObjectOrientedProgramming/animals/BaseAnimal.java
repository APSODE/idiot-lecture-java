package main.java.Assignment.ObjectOrientedProgramming.animals;

public abstract class BaseAnimal implements ActionInterface, FeatureInterface {
    protected String animalName;
    protected String animalHabitat;
    protected String animalSound;
    protected String animalFood;

    public BaseAnimal(String animalName, String animalHabitat, String animalSound, String animalFood) {
        this.animalName = animalName;
        this.animalHabitat = animalHabitat;
        this.animalSound = animalSound;
        this.animalFood = animalFood;
    }

    public String getAnimalName() {
        return animalName;
    }

    // 추상클래스 안에 존재하는 추상 메서드는 꼭 세부 구현을 정의할 필요가 없음
    @Override
    public void lives() {}

    @Override
    public void eats() {}

    @Override
    public void sounds() {}

    @Override
    public void feature() {}
}
