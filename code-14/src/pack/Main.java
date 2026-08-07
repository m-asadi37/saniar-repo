package pack;

public class Main {

    public static void main(String[] args) {
        PaymentService service = new CartToCartService();
        boolean result = service.payment(new PaymentInfo("123", "456", 120000));
        System.out.println(result);
    }
}
