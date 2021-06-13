package Intro.SimUDuck.Behaviors.Fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
