package Intro.StrategyPattern.ActionGame.Character;

import Intro.StrategyPattern.ActionGame.WeaponBehavior.SwordBehavior;

public class Knight extends Character{
    public Knight() {
        weapon = new SwordBehavior();
    }
}
