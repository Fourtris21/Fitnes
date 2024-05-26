package utilities;

import interfaces.Observer;
import strategy.CashPayment;
import strategy.MasterCardPayment;
import strategy.RevolutPayment;
import context.PaymentsMethods;

public class Trainee implements Observer {
    private String name;
    private int age;
    private String email;
    private CardInfo card;
    private PaymentsMethods paymentsMethods;

    public Trainee(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = name + "@gmail.com";
        this.paymentsMethods = new PaymentsMethods();
        this.card = new CardInfo();
    }

    @Override
    public void update(String message) {
        System.out.println("Здравей " + name +  ", има ъпдейт по твоя тренировъчен план:  " + message);
    }
    public void pay() {
        paymentsMethods.showAllPayments();
        int choice = paymentsMethods.choosePayment();
        switch (choice) {
            case 1:
                this.paymentsMethods.setPaymentStrategy(new CashPayment(this.email));
                this.paymentsMethods.pay(50);
                break;
           case 2:
                this.paymentsMethods.setPaymentStrategy(new MasterCardPayment(this.card));
                this.paymentsMethods.pay(50);
                break;
           case 3:
               this.paymentsMethods.setPaymentStrategy(new RevolutPayment(this.card));
               this.paymentsMethods.pay(50);
               break;
        }
    }
}
