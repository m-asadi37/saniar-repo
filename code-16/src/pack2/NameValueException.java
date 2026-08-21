package pack2;

public class NameValueException extends RuntimeException {

    public NameValueException() {
        super("name must have be 1 character or more");
    }
}
