package pack3;

import pack1.PaymentStatus;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Payment p1 = new Payment(1000);
        p1.accept();


        Payment p2 = new Payment(12000);
        p2.reject();

        System.out.print("available statuses : ");
        System.out.println(Arrays.toString(PaymentStatus.values()));
        String str = scanner.nextLine();
        PaymentStatus status = PaymentStatus.valueOf(str);
        Payment p3 = new Payment(2000, status);

    }
}
