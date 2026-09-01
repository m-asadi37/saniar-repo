package pack2;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        java.util.List<Integer> list1 = List.of(1, 2, 3, 4);

        for (Integer i : list1) {
            System.out.println(i);
        }

        //method reference
        Consumer<Integer> c1 = System.out::println;
        list1.forEach(c1);
    }
}
