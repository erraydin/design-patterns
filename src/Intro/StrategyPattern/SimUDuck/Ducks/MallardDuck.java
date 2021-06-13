package Intro.StrategyPattern.SimUDuck.Ducks;

import Intro.StrategyPattern.SimUDuck.Behaviors.Fly.FlyWithWings;
import Intro.StrategyPattern.SimUDuck.Behaviors.Quack.Quack;

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
