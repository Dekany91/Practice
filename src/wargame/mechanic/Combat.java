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

    public void Attack(Soldier soldier, Soldier enemy){
        if (soldier.getAttackRange() > enemy.getAttackRange()){
            enemy.setHealth(enemy.getHealth() - soldier.getDamage());
        } else if (soldier.getAttackRange() < enemy.getAttackRange()) {
            soldier.setHealth(soldier.getHealth() - enemy.getDamage());
        }else {
            enemy.setHealth(enemy.getHealth() - soldier.getDamage());
            soldier.setHealth(soldier.getHealth() - enemy.getDamage());
        }
    }
}
