package wargame.mechanic;

import java.util.List;
import wargame.army.Army;
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
            List<Soldier> hungarySoldiers = hungaryArmy.fillArmy();
            System.out.println("Hungary ready for battle!");
            List<Soldier> turkeySoldiers = turkeyArmy.fillArmy();
            System.out.println("Turkey ready for battle!");

            for (int i = 0; i < Math.min(hungarySoldiers.size(), turkeySoldiers.size()); i++) {
                Soldier hungarySoldier = hungarySoldiers.get(i);
                Soldier turkeySoldier = turkeySoldiers.get(i);
                combat.fight(hungarySoldier, turkeySoldier);
                combat.Attack(hungarySoldier, turkeySoldier);
            }
            System.out.println("The battle has ended!");

        }

        public String battleLog(Army winner, Army loser) {
            StringBuilder log = new StringBuilder();
            log.append("Battle Summary:\n");
            log.append("Winner Army: ").append(winner.getKing().getMotto()).append("\n");
            log.append("Remaining Soldiers: ").append(winner.getSoldiers().size()).append("\n");
            log.append("Loser Army: ").append(loser.getKing().getMotto()).append("\n");
            log.append("Remaining Soldiers: ").append(loser.getSoldiers().size()).append("\n");
            return log.toString();
        }

    }






