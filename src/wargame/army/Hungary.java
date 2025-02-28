package wargame.army;

import java.util.List;

public class Hungary {
    Army army = new Army(List.of(), 500);
    King king = new King("Matthias Corvinus", "Virtus et Honor");

    public King getKing() {
        return king;
    }

    public Army getArmy() {
        return army;
    }
}
