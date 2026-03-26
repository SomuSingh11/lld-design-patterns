package behavioral.strategy.payment;

public class PaypalPayment implements PaymentStrategy {
    private final String email;

    public PaypalPayment(String email){
        this.email = email;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Sending $" + amount + " via PayPal to " + email);
        return true;
    }
}
