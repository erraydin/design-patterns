package Intro.SimUDuck.Ducks;

import Intro.SimUDuck.Behaviors.Fly.FlyNoWay;
import Intro.SimUDuck.Behaviors.Quack.Squeak;
import Intro.SimUDuck.Ducks.Duck;

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
