package strategy;

import interfaces.PaymentStrategy;

public class CashPayment implements PaymentStrategy {
    private String Email;

    public CashPayment(String email) {
        this.Email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Сумата от " + amount + " лв трябва да бъде платена на каса на EasyPay ");
    }
}
