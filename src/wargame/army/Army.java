package wargame.army;

import wargame.soilder.Archer;
import wargame.soilder.Horseman;
import wargame.soilder.Soldier;
import wargame.soilder.Swordsman;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Army {
 private List<Soldier> soldiers;
 private int armySize = 50;
 King king;

    public Army(List<Soldier> soldiers, int armySize) {
        this.armySize = armySize;
        this.soldiers = soldiers;
    }


    public List<Soldier> fillArmy() {
        if (soldiers.size() >= armySize) return soldiers;
        Random rand = new Random();
        List<Soldier> soldiers = new ArrayList<>();

        while (soldiers.size() < armySize) {
            int randomSoldier = rand.nextInt(3);
            switch (randomSoldier) {
                case 0 -> soldiers.add(new Archer());
                case 1 -> soldiers.add(new Swordsman());
                case 2 -> soldiers.add(new Horseman());
            }
        }
        return soldiers;
    }


    public King getKing() {
        return king;
    }

    public void setKing(King king) {
        this.king = king;
    }


    public Collection<Object> getSoldiers() {
        return List.of(soldiers);
    }

}
