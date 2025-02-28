package wargame.mechanic;

import java.util.List;
import wargame.army.Army;
import wargame.army.Hungary;
import wargame.army.King;
import wargame.army.Turkey;
import wargame.soilder.Soldier;

    public class Battle {
        private Army hungaryArmy;
        private Army turkeyArmy;
        private Combat combat;

        public Battle(Army hungaryArmy, Army turkeyArmy) {
            this.hungaryArmy = hungaryArmy;
            this.turkeyArmy = turkeyArmy;
            this.combat = new Combat();
        }

        public void startBattle() {
            List<Soldier> hungarySoldiers = hungaryArmy.getSoldiers();
            System.out.println("Hungary ready for battle!");
            List<Soldier> turkeySoldiers = turkeyArmy.getSoldiers();
            System.out.println("Turkey ready for battle!");

            for (int i = 0; i < Math.min(hungarySoldiers.size(), turkeySoldiers.size()); i++) {
                Soldier hungarySoldier = hungarySoldiers.get(i);
                Soldier turkeySoldier = turkeySoldiers.get(i);
                combat.fight(hungarySoldier, turkeySoldier);
                combat.Attack(hungarySoldier, turkeySoldier);
            }
            System.out.println("The battle has ended!");

            private String getWinningKingMotto() {
                }
            }
        }
    }

