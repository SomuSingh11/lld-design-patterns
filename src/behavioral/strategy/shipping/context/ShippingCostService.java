package behavioral.strategy.shipping.context;

import behavioral.strategy.shipping.model.Order;
import behavioral.strategy.shipping.strategy.ShippingStrategy;

public class ShippingCostService {
    private ShippingStrategy strategy;

    // Method to set initial Strategy
    public ShippingCostService(ShippingStrategy strategy){
        this.strategy = strategy;
    }

    // Method to change the strategy at runtime
    public void setStrategy(ShippingStrategy strategy){
        System.out.println("ShippingCostService: Strategy changed to " + strategy.getClass().getSimpleName());
        this.strategy = strategy;
    }

    public double calculateShippingCost(Order order){
        if(strategy == null) {
            throw new IllegalStateException("Shipping strategy not set.");
        }

        double cost = strategy.calculateCost(order);
        System.out.println("ShippingCostService: Final Calculated Shipping Cost: $" + cost +
                " (using " + strategy.getClass().getSimpleName() + ")");
        return cost;
    }
}
