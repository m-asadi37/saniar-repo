package pack1;

public class Main {

    public static void main(String[] args) {
        System.out.println(Person.getCount());
        Person.display();

        Person person = new Person();
        System.out.println(person.getId());

        Person person1 = new Person();
        System.out.println(person1.getId());
        person1.display();
        person1.display2();

        Person.display();
    }
}
