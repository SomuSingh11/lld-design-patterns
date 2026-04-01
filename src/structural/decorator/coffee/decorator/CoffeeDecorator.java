package structural.decorator.coffee.decorator;

import structural.decorator.coffee.component.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee inner;

    public CoffeeDecorator(Coffee inner){
        this.inner = inner;
    }
}
