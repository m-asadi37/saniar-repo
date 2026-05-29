package pack1;

import pack3.Payment;

public class Main {

    public static void main1(String[] args) {
        Person p1 = new Person("saniar", "12345");

        Person p2 = new Person("amir", "12345");

        Payment c1 = new Payment(12000);

        System.out.println(p1);

        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(null));
        System.out.println(p1.equals(c1));
        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }


}
