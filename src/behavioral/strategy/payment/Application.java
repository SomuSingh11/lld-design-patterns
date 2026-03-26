package behavioral.strategy.payment;

public class Application {
    public static void main(String[] args) {
        PaymentStrategy strategy1 = new CreditCardPayment("123456789", "12/12");
        PaymentStrategy strategy2 = new PaypalPayment("k4ge@gmail.com");
        PaymentStrategy strategy3 = new CryptoPayment("walletx0ABCX");

        CheckoutService checkout = new CheckoutService(strategy1);
        checkout.checkout(100);

        checkout.setPaymentStrategy(strategy2);
        checkout.checkout(200);

        checkout.setPaymentStrategy(strategy3);
        checkout.checkout(300);
    }
}
