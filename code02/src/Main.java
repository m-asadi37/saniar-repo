public class Main {

    public static void main(String[] args) {

        int a = 10;
        //b = a
        //a = a+1
        int b = a++;
        //a = a+1
        //c = a
        int c = ++a;

        //counter = counter+1
        //id = counter
        int counter = 0;
        Person p1 = new Person("ali", ++counter);
        Person p2 = new Person("bahar", ++counter);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("*****");

        Person p3 = new Person("p3");
        Person p4 = new Person("p4");
        Person p5 = new Person("p5");
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
