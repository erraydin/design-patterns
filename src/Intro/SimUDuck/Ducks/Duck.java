package Intro.SimUDuck.Ducks;

import Intro.SimUDuck.Behaviors.Fly.FlyBehavior;
import Intro.SimUDuck.Behaviors.Quack.QuackBehavior;

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
