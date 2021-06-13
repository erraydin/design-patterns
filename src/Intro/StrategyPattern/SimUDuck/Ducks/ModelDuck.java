package Intro.StrategyPattern.SimUDuck.Ducks;

import Intro.StrategyPattern.SimUDuck.Behaviors.Fly.FlyNoWay;
import Intro.StrategyPattern.SimUDuck.Behaviors.Quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I am a model duck!");
    }
}
