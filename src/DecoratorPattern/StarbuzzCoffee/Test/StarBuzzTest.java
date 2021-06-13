package DecoratorPattern.StarbuzzCoffee.Test;

import DecoratorPattern.StarbuzzCoffee.Beverage.Beverage;
import DecoratorPattern.StarbuzzCoffee.Beverage.DarkRoast;
import DecoratorPattern.StarbuzzCoffee.Beverage.Espresso;
import DecoratorPattern.StarbuzzCoffee.Condiment.Mocha;
import DecoratorPattern.StarbuzzCoffee.Condiment.Whip;

public class StarBuzzTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        System.out.println("");

        //Double mocha with whip cream
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        System.out.println("");
    }
}
