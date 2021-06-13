package Intro.SimUDuck.Ducks;

import Intro.SimUDuck.Behaviors.Fly.FlyWithWings;
import Intro.SimUDuck.Behaviors.Quack.Quack;
import Intro.SimUDuck.Ducks.Duck;

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
