package StrategyPattern.ActionGame.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void use() {
        System.out.println("Cut cut!");
    }
}
