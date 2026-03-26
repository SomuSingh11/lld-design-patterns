package behavioral.strategy.payment;

public class CheckoutService {
    private PaymentStrategy strategy;

    public CheckoutService(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public boolean checkout(double amount){
        return strategy.pay(amount);
    }
}
