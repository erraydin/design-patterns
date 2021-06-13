package Intro.StrategyPattern.ActionGame.Test;

import Intro.StrategyPattern.ActionGame.Character.Character;
import Intro.StrategyPattern.ActionGame.Character.Knight;
import Intro.StrategyPattern.ActionGame.WeaponBehavior.BowBehavior;

public class ActionGameTest {
    public static void main(String[] args) {
        Character knight = new Knight();
        knight.fight();
        knight.setWeapon(new BowBehavior());
        knight.fight();
    }
}
