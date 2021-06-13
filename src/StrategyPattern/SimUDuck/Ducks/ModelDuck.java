package StrategyPattern.SimUDuck.Ducks;

import StrategyPattern.SimUDuck.Behaviors.Fly.FlyNoWay;
import StrategyPattern.SimUDuck.Behaviors.Quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I am a model duck!");
    }
}
