package StrategyPattern.ActionGame.WeaponBehavior;

public class BowBehavior implements WeaponBehavior{
    @Override
    public void use() {
        System.out.println("draw, release, piuuuuuuf!");
    }
}
