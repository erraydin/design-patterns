package Intro.StrategyPattern.SimUDuck.Behaviors.Fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
