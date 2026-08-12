package pack3;

public class PaymentServiceImpl extends PaymentService {

    @Override
    public void payment(double amount, String from, String to) {
        System.out.printf("transfer from %s to %s with amount of %,.0f%n",
                from, to, amount);
    }
}
