package strategy;

import base.CardPaymentBase;
import interfaces.PaymentStrategy;

import java.util.Date;

public class RevolutPayment extends CardPaymentBase implements PaymentStrategy {

    public RevolutPayment(CardPaymentBase cpb) {
    }

    @Override
    public void pay(int amount) {
        System.out.println("Платена сума " + amount + " лв с револют ");
    }
}
