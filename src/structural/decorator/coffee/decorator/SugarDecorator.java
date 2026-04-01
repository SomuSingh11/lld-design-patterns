package structural.decorator.coffee.decorator;

import structural.decorator.coffee.component.Coffee;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee inner) {
        super(inner);
    }

    @Override
    public double getCost() {
        return inner.getCost() + 0.20;
    }

    @Override
    public String getDescription() {
        return inner.getDescription() + ", sugar";
    }
}
