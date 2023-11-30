package main.java.Assignment.idiot_assignment1;

public class Car {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.printStatus();
        car1.drive(60.0, 0.5);
        car1.printStatus();
        car1.drive(120.0, 1.0);
        car1.printStatus();

    }

    private double fuel;
    private double distance;

    public Car() {
        this.fuel = 15.0;
        this.distance = 0.0;
    }

    public void drive(double speed, double time) {
        double dist = speed * time;
        double usedFuel = dist / 8.0;

        if (this.fuel - usedFuel < 0) {
            dist = this.fuel * 8;  // 남은 연료량으로 이동할 수 있는 최대 거리
            this.fuel = 0;
        } else {
            this.fuel -= usedFuel;
        }
        this.distance += dist;
    }

    public void printStatus() {
        System.out.println("fuel = " + this.fuel + ", distance = " + this.distance);
    }

}
