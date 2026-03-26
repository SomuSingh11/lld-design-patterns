package behavioral.strategy.shipping.strategy;

import behavioral.strategy.shipping.model.Order;

public interface ShippingStrategy {
    double calculateCost(Order order);
}
