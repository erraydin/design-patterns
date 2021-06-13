package Intro.SimUDuck.Test;

import Intro.SimUDuck.Behaviors.Fly.FlyRockerPowered;
import Intro.SimUDuck.Ducks.*;

public class Test {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.fly();
        System.out.println("");

        Duck redHead = new RedHeadDuck();
        redHead.display();
        redHead.quack();
        redHead.fly();
        System.out.println("");

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.quack();
        rubber.fly();
        System.out.println("");

        Duck model = new ModelDuck();
        model.display();
        model.fly();
        model.setFlyBehavior(new FlyRockerPowered());
        model.fly();


    }
}
