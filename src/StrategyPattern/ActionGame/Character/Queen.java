package StrategyPattern.ActionGame.Character;

import StrategyPattern.ActionGame.WeaponBehavior.KnifeBehavior;

public class Queen extends Character{
    public Queen() {
        weapon = new KnifeBehavior();
    }
}
