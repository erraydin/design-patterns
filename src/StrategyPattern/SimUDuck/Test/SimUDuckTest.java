package StrategyPattern.SimUDuck.Test;

import StrategyPattern.SimUDuck.Behaviors.Fly.FlyRockerPowered;
import StrategyPattern.SimUDuck.Ducks.*;

public class SimUDuckTest {
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
