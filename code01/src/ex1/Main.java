package ex1;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("red","123");
        Engine engine = new Engine(1200, "mitsubishi");

        car.setEngine(engine);
        car.print();
    }
}
