package pack;

import java.time.LocalDateTime;

public class PaymentInfo {

    String fromAccount;
    String toAccount;
    Integer amount;
    Integer commission;
    LocalDateTime time;

    public PaymentInfo(String fromAccount, String toAccount, Integer amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.commission = (int) (amount * 0.05);
        this.time = LocalDateTime.now();
    }
}
