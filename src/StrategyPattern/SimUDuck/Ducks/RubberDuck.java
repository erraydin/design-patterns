package StrategyPattern.SimUDuck.Ducks;

import StrategyPattern.SimUDuck.Behaviors.Fly.FlyNoWay;
import StrategyPattern.SimUDuck.Behaviors.Quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I am a rubber duck!");
    }
}
