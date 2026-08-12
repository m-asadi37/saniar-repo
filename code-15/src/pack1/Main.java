package pack1;

public class Main {

    public static void main(String[] args) {

        PersonService service = new JavaPersonService();

        Person p1 = new Person(1, "saniar", "noorani", 13);

        service.save(p1);

        service.display(p1);
    }
}
