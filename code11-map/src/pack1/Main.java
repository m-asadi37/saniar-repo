package pack1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main1(String[] args) {
        Set<Person> set1 = new TreeSet<>();

        set1.add(new Person("saniar"));
        set1.add(new Person("ali"));
        set1.add(new Person("reza"));
        set1.add(new Person("bahar"));
        set1.add(new Person("negar"));

        System.out.println(set1);
    }

    public static void main(String[] args) {
        //key-value pair
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(4, "saniar");
        map1.put(7, "ali");
        map1.put(13, "reza");
        map1.put(-2, "bahar");
        map1.put(0, "negar");
        System.out.println(map1);

        System.out.println(map1.get(4));

        System.out.println(map1.remove(3));

        System.out.println(map1);

        System.out.println(map1.containsKey(-2));
        System.out.println(map1.containsValue("reza"));

        Map<String, String> map2 = new HashMap<>();
        map2.put("hello", "سلام");
        map2.put("b", "B");
        map2.put("c", "C");
        map2.put("d", "A");
        map2.put("d", "B");
        map2.put(null, "Z");
        map2.put(null, "Y");
        map2.put("z", null);
        map2.put("y", null);
        System.out.println(map2);
    }
}
