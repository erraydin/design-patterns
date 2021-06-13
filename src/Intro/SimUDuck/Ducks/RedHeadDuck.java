package Intro.SimUDuck.Ducks;

import Intro.SimUDuck.Behaviors.Fly.FlyWithWings;
import Intro.SimUDuck.Behaviors.Quack.Quack;
import Intro.SimUDuck.Ducks.Duck;

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
