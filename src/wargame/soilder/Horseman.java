package wargame.soilder;

public class Horseman extends Soldier{
    public Horseman() {
        super(25, 25, 15, 3); //they have long pikes
    }

    @Override
    public void Attack(Soldier soldier, Soldier enemy) {
        if (soldier.getAttackRange() > enemy.getAttackRange()){
            int wound = enemy.getDefense() - soldier.getDamage();
            enemy.setHealth(enemy.getHealth() - wound);
        } else if (soldier.getAttackRange() < enemy.getAttackRange()) {
            int wound = soldier.getDefense() - enemy.getDamage();
            soldier.setHealth(soldier.getHealth() - wound);
        }else {
            int wound = enemy.getDefense() - soldier.getDamage();
            enemy.setHealth(enemy.getHealth() - wound);
            wound = soldier.getDefense() - enemy.getDamage();
            soldier.setHealth(soldier.getHealth() - wound);
        }
    }

}
