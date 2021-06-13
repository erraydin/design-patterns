package StrategyPattern.SimUDuck.Ducks;

import StrategyPattern.SimUDuck.Behaviors.Fly.FlyWithWings;
import StrategyPattern.SimUDuck.Behaviors.Quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am a mallard duck!");
    }
}
