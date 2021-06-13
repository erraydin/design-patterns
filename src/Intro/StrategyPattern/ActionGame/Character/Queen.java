package Intro.StrategyPattern.ActionGame.Character;

import Intro.StrategyPattern.ActionGame.WeaponBehavior.KnifeBehavior;

public class Queen extends Character{
    public Queen() {
        weapon = new KnifeBehavior();
    }
}
