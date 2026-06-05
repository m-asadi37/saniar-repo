package pack1;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main1(String[] args) {
        String s1 = "d";
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add(s1);
        list.add(s1);
        list.add(s1);
        list.add(null);
        list.add(null);
        System.out.println(list);
        System.out.println("ind 0 : " + list.get(0));
        System.out.println("ind 8 : " + list.get(8));
        list.remove(5);
        System.out.println(list);
        list.clear();
        System.out.println(list);

        String[] arr = new String[10];
        arr[0] = "a";
    }

    public static void main2(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person p1 = new Person("saniar");
        Person p2 = new Person("mohammad");

        personList.add(p1);
        System.out.println(personList.size());

        personList.add(p2);
        System.out.println(personList.size());

        System.out.println(personList.getLast());

        for (Person p : personList) {
            System.out.println("item : " + p);
        }

        personList.add(new Person("bahar"));
        personList.add(new Person("negar"));

        personList.remove(p2);
        personList.remove(p1);
        System.out.println(personList);
        System.out.println(personList.contains(p1));

        personList.add(1, p1);
        System.out.println(personList);

        System.out.println(personList.contains(p1));

        System.out.println(personList.indexOf(p1));

        personList.set(1, p2);
        System.out.println(personList);

        List<Person> personList1 = personList.reversed();
        System.out.println(personList1);
    }
}
