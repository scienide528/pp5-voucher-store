package pl.ltalar.payment.payu.exceptions;

public class PayUException extends Exception {
    public PayUException(Exception e) {
        super(e);
    }
}
