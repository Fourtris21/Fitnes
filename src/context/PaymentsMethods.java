package context;

import interfaces.PaymentStrategy;

import java.util.Scanner;

public class PaymentsMethods {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
    public void showAllPayments() {
        System.out.println("1. Кеш");
        System.out.println("2. Мастър карта");
        System.out.println("3. Револют");
        System.out.println("Избери число:");
    }
    public int choosePayment() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
