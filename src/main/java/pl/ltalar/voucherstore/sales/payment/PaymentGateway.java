package pl.ltalar.voucherstore.sales.payment;

import pl.ltalar.payment.payu.exceptions.PayUException;
import pl.ltalar.voucherstore.sales.ordering.Reservation;

public interface PaymentGateway {
    PaymentDetails registerFor(Reservation reservation) throws PayUException;

    boolean isTrusted(PaymentUpdateStatusRequest updateStatusRequest);
}
