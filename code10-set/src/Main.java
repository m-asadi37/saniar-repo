import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
//        Set<String> set1 = new LinkedHashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("b");
        set1.add("c");
        set1.add(null);
        set1.add("d");
        set1.add(null);
        System.out.println(set1);

        Set<Person> set2 = new HashSet<>();
        set2.add(new Person(1, "saniar"));
        set2.add(new Person(2, "mohammad"));
        set2.add(new Person(2, "reza"));
        Person p1 = new Person(3, "ali");
        set2.add(p1);

        System.out.println(set2);
        set2.remove(p1);
        System.out.println(set2);

        for (Person p : set2) {
            if (p.id == 2)
                System.out.println(p);
        }

        Random rand = new Random();
        Set<Integer> set3 = new TreeSet<>();
        Set<Integer> set4 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(1, 100);
            set3.add(n);
            set4.add(n);
        }
        System.out.println(set3);
        System.out.println(set4);
    }
}
