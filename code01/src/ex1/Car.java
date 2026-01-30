package ex1;

public class Car {

    private String color;
    private String plate;
    private Engine engine;

    public Car(String color, String plate) {
        this.color = color;
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void print() {
        System.out.println("ex1.Car{" +
                "color='" + color + '\'' +
                ", plate='" + plate + '\'' +
                ", engine=" + engine.getModel() +
                '}');
    }
}
