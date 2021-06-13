package Intro.StrategyPattern.ActionGame.Character;

import Intro.StrategyPattern.ActionGame.WeaponBehavior.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    public void fight(){
        weapon.use();
    }
}
