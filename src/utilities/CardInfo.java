package utilities;

import base.CardPaymentBase;

import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

public class CardInfo extends CardPaymentBase {
    private String ownerName;
    public CardInfo() {
        generateCardInfo();
    }

    private void generateCardInfo()
    {
        Random rand = new Random();
        this.cardNumber = String.valueOf(rand.nextInt(10000000));
        this.expiryDate = new Date(System.currentTimeMillis() + rand.nextInt(10000));
        this.CVV = rand.nextInt(2);
    }
}
