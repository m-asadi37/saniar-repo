package pack2;

public class Person {

    String name;
    int age;

    public Person(String name, int age) throws AgeValueException {
        if (age < 0) {
            throw new AgeValueException();
        }
        if (name.isBlank()) {
            throw new NameValueException();
        }
        this.name = name;
        this.age = age;
    }
}
