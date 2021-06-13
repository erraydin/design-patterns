package Intro.StrategyPattern.ActionGame.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void use() {
        System.out.println("Stab stab!!");
    }
}
