package StrategyPattern.ActionGame.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void use() {
        System.out.println("Slash slash!");
    }
}
