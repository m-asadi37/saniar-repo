package pack1;

public interface PersonService {

    public static final int MaxId = 1000;

    public void save(Person person);

    Person findById(int id);

    void delete(int id);

    default void display(Person person) {
        test();
        System.out.println(person);
    }

    private void test() {
        System.out.println("test...");
    }
}
