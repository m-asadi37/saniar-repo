package pack2;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("123", "ali");
        Person person2 = new Person("456", "reza");

        System.out.println(person);
        System.out.println(person2);

        person.getAddresses().add("aa- ss - cc");
        System.out.println(person.getAddresses());
    }
}
