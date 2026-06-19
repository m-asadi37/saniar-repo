package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list0 = new ArrayList<>();
        list0.add("a");//1
        list0.add("b");//2
        list0.add("c");//3
        list0.add("d");//4
        list0.addFirst("0");//0

        var list0r = list0.reversed();
        System.out.println(list0);
        System.out.println(list0r);

        System.out.println(list0.get(2));

        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.get(2));
        System.out.println(list.indexOf("e"));

        Iterator<String> iter = list.iterator();
        iter.next();
        iter.remove();
        System.out.println(list);

        System.out.println(list0.subList(2, 4));
    }
}
