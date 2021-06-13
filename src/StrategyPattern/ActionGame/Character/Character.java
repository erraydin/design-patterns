package StrategyPattern.ActionGame.Character;

import StrategyPattern.ActionGame.WeaponBehavior.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    public void fight(){
        weapon.use();
    }
}
