package Intro.SimUDuck.Test;

import Intro.SimUDuck.Ducks.Duck;
import Intro.SimUDuck.Ducks.MallardDuck;
import Intro.SimUDuck.Ducks.RedHeadDuck;
import Intro.SimUDuck.Ducks.RubberDuck;

public class Test {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.fly();

        Duck redHead = new RedHeadDuck();
        redHead.quack();
        redHead.fly();

        Duck rubber = new RubberDuck();
        rubber.quack();
        rubber.fly();


    }
}
