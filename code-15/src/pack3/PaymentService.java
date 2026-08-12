package pack3;

public abstract class PaymentService {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void payment(double amount, String from, String to);

    public void test() {
        System.out.println("test");
    }
}
