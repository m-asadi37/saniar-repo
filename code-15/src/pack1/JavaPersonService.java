package pack1;

import java.util.HashSet;
import java.util.Set;

public class JavaPersonService implements PersonService {

    private Set<Person> personSet = new HashSet<>();

    @Override
    public void save(Person person) {
        if (person.id < MaxId) {
            personSet.add(person);
        }
    }

    @Override
    public Person findById(int id) {
        for (Person person : personSet) {
            if (person.id == id)
                return person;
        }
        return null;
        /*return personSet.stream()
                .filter(person -> person.id == id)
                .findAny()
                .orElse(null);*/
    }

    @Override
    public void delete(int id) {
        for (Person person : personSet) {
            if (person.id == id) {
                personSet.remove(person);
                break;
            }
        }
    }

    @Override
    public void display(Person person) {
        System.out.println("java service display method...");
        System.out.println(person);
    }

}
