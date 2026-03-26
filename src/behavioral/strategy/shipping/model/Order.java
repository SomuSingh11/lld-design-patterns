package behavioral.strategy.shipping.model;

public class Order {
    private double totalWeight;
    private String destinationZone;
    private double orderValue;

    public Order(double totalWeight, String destinationZone, double orderValue){
        this.destinationZone = destinationZone;
        this.totalWeight = totalWeight;
        this.orderValue = orderValue;
    }

    public double getTotalWeight(){
        return totalWeight;
    }
    public String getDestinationZone(){
        return destinationZone;
    }
    public double getOrderValue(){
        return orderValue;
    }
}
