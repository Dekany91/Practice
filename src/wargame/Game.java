package wargame;


import wargame.army.Army;
import wargame.army.Hungary;
import wargame.army.Turkey;
import wargame.mechanic.Battle;

import java.util.List;

public class Game {
    public static void main(String[] args) {
        System.out.println("The battle has begun!");
        Army hungary = new Army(List.of(), 500);
        Army turkey = new Army(List.of(), 500);
        Battle battle = new Battle( hungary, turkey);
        battle.startBattle();
    }
}
