package base;

import java.util.Date;

public class CardPaymentBase {
    protected String cardNumber;
    protected int CVV;
    protected Date expiryDate;

    public CardPaymentBase(){};
    public CardPaymentBase(String cardNumber, int CVV, Date expiryDate) {}
}
