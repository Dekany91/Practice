package wargame.mechanic;

import wargame.soilder.Archer;
import wargame.soilder.Horseman;
import wargame.soilder.Soldier;
import wargame.soilder.Swordsman;

public class Combat {
    Archer archer;
    Swordsman swordsman;
    Horseman horseman;

    public void fight(Soldier soldier, Soldier enemy){
        if (soldier.equals(archer) && enemy.equals(swordsman)){
            archer.setDamage(30);
        }
        if (soldier.equals(horseman) && enemy.equals(archer)){
            horseman.setDamage(40);
        }
        if (soldier.equals(swordsman) && enemy.equals(horseman)){
            swordsman.setDamage(40);
        }
    }
}
