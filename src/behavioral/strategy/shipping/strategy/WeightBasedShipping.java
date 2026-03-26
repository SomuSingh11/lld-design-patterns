package behavioral.strategy.shipping.strategy;

import behavioral.strategy.shipping.model.Order;

public class WeightBasedShipping implements ShippingStrategy{
    private final double ratePerKg;

    public WeightBasedShipping(double ratePerKg){
        this.ratePerKg = ratePerKg;
    }
    @Override
    public double calculateCost(Order order){
        System.out.println("Calculating with Weight-Based strategy ($" + ratePerKg + "/kg)");
        return order.getTotalWeight() * ratePerKg;
    }
}
