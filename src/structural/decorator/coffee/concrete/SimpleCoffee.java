package structural.decorator.coffee.concrete;

import structural.decorator.coffee.component.Coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1.00;
    }

    @Override
    public String getDescription(){
        return "Simple Coffee";
    }
}
