package StrategyPattern.SimUDuck.Behaviors.Quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack Quack!");
    }
}

