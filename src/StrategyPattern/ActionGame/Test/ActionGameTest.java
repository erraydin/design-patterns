package StrategyPattern.ActionGame.Test;

import StrategyPattern.ActionGame.Character.Character;
import StrategyPattern.ActionGame.Character.Knight;
import StrategyPattern.ActionGame.WeaponBehavior.BowBehavior;

public class ActionGameTest {
    public static void main(String[] args) {
        Character knight = new Knight();
        knight.fight();
        knight.setWeapon(new BowBehavior());
        knight.fight();
    }
}
