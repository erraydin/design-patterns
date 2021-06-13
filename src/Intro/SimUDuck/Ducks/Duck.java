package Intro.SimUDuck.Ducks;

import Intro.SimUDuck.Behaviors.Fly.FlyBehavior;
import Intro.SimUDuck.Behaviors.Quack.QuackBehavior;

public class Duck {
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
}
