package pack;

public class CartToCartService implements PaymentService {

    @Override
    public boolean payment(PaymentInfo paymentInfo) {
        if (paymentInfo.fromAccount == null || paymentInfo.toAccount == null) {
            System.out.println("validate from/to account numbers...");
            return false;
        }

        if (paymentInfo.amount < 1) {
            System.out.println("Invalid amount");
            return false;
        }

        System.out.println("withdrawal amount from " + paymentInfo.fromAccount);

        System.out.println("deposit amount to " + paymentInfo.toAccount);

        System.out.println("notify to user");

        return true;
    }
}
