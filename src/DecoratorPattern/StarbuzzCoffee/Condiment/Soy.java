package DecoratorPattern.StarbuzzCoffee.Condiment;

import DecoratorPattern.StarbuzzCoffee.Beverage.Beverage;

public class Soy extends CondimentDecorator{
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
