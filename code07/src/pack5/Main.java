package pack5;

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.name = "airplane";
        v1.speed = 900;
        v1.move();

        Car c1 = new Car();
        c1.name = "bmw";
        c1.speed = 300;
        c1.plaque = "1234er56";
        c1.move();

        Vehicle v2 = new Car();
        v2.name = "bmw";
        v2.speed = 300;
//        v2.plaque = "1234er56";
        v2.move();

        Car c3 = (Car) v2;
        c3.plaque = "111122";
    }
}
