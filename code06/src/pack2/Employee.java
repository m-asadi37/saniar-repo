package pack2;

public class Employee {

    private String name;
    String family;

    public Employee() {
    }

    public Employee(String name) {
        System.out.println("Employee Constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getNowCaller(){
        return this;
    }
}
