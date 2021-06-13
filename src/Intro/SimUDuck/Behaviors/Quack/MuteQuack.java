package Intro.SimUDuck.Behaviors.Quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("[no sound...]");
    }
}
