package pack3;

import pack1.PaymentStatus;

import java.time.LocalDateTime;

public class Payment {

    private static int count;
    private int id;
    private double amount;
    private LocalDateTime time;
    private PaymentStatus status;

    public Payment(double amount) {
        this.id = ++count;
        this.amount = amount;
        this.time = LocalDateTime.now();
        this.status = PaymentStatus.PENDING;
    }

    public Payment(double amount, PaymentStatus status) {
        this.id = ++count;
        this.amount = amount;
        this.time = LocalDateTime.now();
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void accept() {
        if (status.equals(PaymentStatus.PENDING)) {
            this.status = PaymentStatus.ACCEPTED;
        }
    }

    public void reject() {
        if (status.equals(PaymentStatus.PENDING)) {
            this.status = PaymentStatus.REJECTED;
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount=" + amount +
                ", time=" + time +
                ", status=" + status +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) return false;

        //this.id VS o.id
        /*if (o.getClass() != this.getClass()) return false;
        Payment p = (Payment) o;
        return this.id == p.id;*/

        if (o instanceof Payment p) {
            return p.id == this.id;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
