package pack2;

import pack1.Person;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("bahar");
        e1.setName("negar");
        System.out.println(e1 == e1.getNowCaller());

        Programmer p1 = new Programmer("saniar");
        p1.showName();
    }
}
