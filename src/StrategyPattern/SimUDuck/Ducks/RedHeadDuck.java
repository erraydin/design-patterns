package StrategyPattern.SimUDuck.Ducks;

import StrategyPattern.SimUDuck.Behaviors.Fly.FlyWithWings;
import StrategyPattern.SimUDuck.Behaviors.Quack.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a redhead duck!");
    }
}
