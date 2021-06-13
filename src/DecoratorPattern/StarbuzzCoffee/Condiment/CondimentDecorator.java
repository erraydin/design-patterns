package DecoratorPattern.StarbuzzCoffee.Condiment;

import DecoratorPattern.StarbuzzCoffee.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
