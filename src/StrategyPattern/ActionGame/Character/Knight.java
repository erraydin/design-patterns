package StrategyPattern.ActionGame.Character;

import StrategyPattern.ActionGame.WeaponBehavior.SwordBehavior;

public class Knight extends Character{
    public Knight() {
        weapon = new SwordBehavior();
    }
}
