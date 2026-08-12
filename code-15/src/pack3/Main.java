package pack3;

public class Main {

    public static void main(String[] args) {
        PaymentService service = new PaymentServiceImpl();
        service.payment(12000000, "123", "345");
    }
}
