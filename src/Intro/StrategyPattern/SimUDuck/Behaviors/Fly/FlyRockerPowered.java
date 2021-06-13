package Intro.StrategyPattern.SimUDuck.Behaviors.Fly;

public class FlyRockerPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
