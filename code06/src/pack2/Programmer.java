package pack2;


public class Programmer extends Employee {

    public Programmer(String name) {
        super(name);
        System.out.println("Programmer Constructor");
    }

    public Programmer() {
        super();
    }

    public void showName() {
        System.out.println("name : " + super.getName());
        System.out.println("family : " + super.family);
    }
}
