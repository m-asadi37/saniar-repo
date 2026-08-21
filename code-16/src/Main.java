import pack2.AgeValueException;
import pack2.NameValueException;
import pack2.Person;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {
        Test test = new Test();

//        test.fileNotFound("test.txt");

        try {
            test.ioExc("test.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

//        System.out.println(test.arithmetic(10, 0));

//        System.out.println(test.sub(10, null));

        //0,1,2,3
        int[] arr = {1, 2, 3, 4};
//        System.out.println(test.getFromArray(arr, 5));

//        System.out.println(test.nullPointer(10));

        System.out.println("end of Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "     ";
        int age = scanner.nextInt();
        Person person = null;

        while (true) {
            try {
                person = new Person(name, age);
            } catch (AgeValueException e) {
                System.out.println("age: ");
                age = scanner.nextInt();
            } catch (NameValueException e) {
                System.out.println("name: ");
                name = scanner.next();
            } finally {
                System.out.println("finally block");
            }
            if (person != null) break;
        }

        System.out.println(person);
    }
}
