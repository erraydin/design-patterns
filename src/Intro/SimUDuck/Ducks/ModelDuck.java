package Intro.SimUDuck.Ducks;

import Intro.SimUDuck.Behaviors.Fly.FlyNoWay;
import Intro.SimUDuck.Behaviors.Quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I am a model duck!");
    }
}
