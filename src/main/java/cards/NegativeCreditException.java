package cards;

public class NegativeCreditException extends RuntimeException {
    public NegativeCreditException(String message) {
        super(message);
    }
}
