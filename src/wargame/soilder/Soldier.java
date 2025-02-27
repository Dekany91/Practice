package wargame.soilder;

public abstract class Soldier {
    private int health;
    private int damage;
    private final int defense;
    private final int attackRange;
    private boolean isAlive;

    public Soldier(int health, int damage, int defense, int attackRange) {
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.attackRange = attackRange;
        isAlive = true;
    }

    public void Attack(Soldier soldier, Soldier enemy){
        int wound = enemy.defense - soldier.damage;
        if (soldier.damage <= 0){
            damage = 0;
        }else {
            damage = enemy.health - wound;
        }
    }

    public boolean isAlive(Soldier soldier){
        if (soldier.health <= 0){
            soldier.health = 0;
            soldier.isAlive = false;
        }
        return false;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
