package pack2;

public class AgeValueException extends RuntimeException {

    public AgeValueException() {
        super("age must be a positive integer");
    }
}
