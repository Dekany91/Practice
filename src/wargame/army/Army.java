package wargame.army;

import wargame.soilder.Archer;
import wargame.soilder.Horseman;
import wargame.soilder.Soldier;
import wargame.soilder.Swordsman;

import java.util.List;
import java.util.Random;

public class Army {
 private List<Soldier> soldiers;
 private int armySize = 500;
 Soldier soldier;

    public Army(List<Soldier> soldiers, int armySize) {
        this.armySize = armySize;
        if (soldiers.size() > armySize) {
            this.soldiers = soldiers.subList(0, armySize);
        } else {
            this.soldiers = soldiers;
            for (int i = soldiers.size(); i < armySize; i++) {
                this.soldiers.add(soldier);
            }
        }
    }

    public void fillArmy() {
        Random rand = new Random();
        for (int i = 0; i < armySize; i++) {
            int randomSoldier = rand.nextInt(3);
            if (randomSoldier == 0) {
                soldiers.add(new Archer());
            } else if (randomSoldier == 1) {
                soldiers.add(new Swordsman());
            } else {
                soldiers.add(new Horseman());
            }
        }
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }
}
