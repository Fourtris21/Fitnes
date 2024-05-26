package strategy;

import base.CardPaymentBase;
import interfaces.PaymentStrategy;

import java.util.Date;

public class MasterCardPayment extends CardPaymentBase implements PaymentStrategy {

    public MasterCardPayment(CardPaymentBase cbp) {
    }
    @Override
    public void pay(int amount) {
         System.out.println("Платена сума " + amount + " лв с мастър карта");
    }
}
