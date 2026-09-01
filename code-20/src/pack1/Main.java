package pack1;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main1(String[] args) throws Exception {

        Calculator t1 = new Sum();
        t1.test(1, 2);


        //lambda expressions
        Calculator t2 = (a, b) -> System.out.println("a - b = " + (a - b));
        t2.test(12, 10);

        Runnable r1 = () -> {
            System.out.println("******");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("******");
        };
        Thread t3 = new Thread(r1);
        t3.start();
        t3.join(500);

        Callable<Integer> c1 = () -> {
            Random r = new Random();
            return r.nextInt(100);
        };
        int res = c1.call();
        System.out.println(res);

        Callable<Double> c2 = () -> new Random().nextDouble();
        System.out.println(c2.call());
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java");

        Consumer<String> c2 = System.out::println;
        c2.accept("java");

        Function<String, Integer> f1 = String::length;
        System.out.println(f1.apply("java"));

        Function<Integer, Integer> f2 = i -> i * i;
        System.out.println(f2.apply(4));

        Supplier<Integer> s1 = () -> new Random().nextInt(100);
        System.out.println(s1.get());

        Predicate<Integer> p1 = i -> {
            if (i > 10) return true;
            else return false;
        };
        System.out.println(p1.test(1));
        System.out.println(p1.test(12));

        Predicate<String> p2 = String::isBlank;
        System.out.println(p2.test(" "));
        System.out.println(p2.test("A"));
    }
}
