package wargame.army;

import java.util.List;

public class Turkey {
    Army army = new Army(List.of(), 500);
    King king = new King("Sulejman", "Allah is with us");

    public Army getArmy() {
        return army;
    }

    public King getKing() {
        return king;
    }
}
