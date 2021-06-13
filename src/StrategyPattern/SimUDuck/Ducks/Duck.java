package StrategyPattern.SimUDuck.Ducks;

import StrategyPattern.SimUDuck.Behaviors.Fly.FlyBehavior;
import StrategyPattern.SimUDuck.Behaviors.Quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void display() {
        System.out.println("I am a duck!");
    }
    public void swim() {
        System.out.println("Swimming...");
    }
    public void quack(){
        quackBehavior.quack();
    }
    public void fly(){
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
