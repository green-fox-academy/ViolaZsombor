package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Pirate> pirates = new ArrayList<>();

    public int getGolds() {
        int allOfTheGolds = 0;
        for (int i = 0; i < pirates.size(); i++) {
            allOfTheGolds += pirates.get(i).getAmountOfGold();
        }
        return allOfTheGolds;
    }

    public List<String> getPoorPirates() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < pirates.size(); i++) {
            if ((pirates.get(i).isHasWoodenLeg() && (pirates.get(i).getAmountOfGold() < 15))) {
                {
                    names.add(pirates.get(i).getName());
                }
            }
        }
        return names;
    }

    public void lastDayOnTheShip() {
        for (int i = 0; i < pirates.size(); i++) {
            pirates.get(i).party();
        }
    }

    public void prepareForBattle() {
        for (int i = 0; i < pirates.size(); i++) {
            for (int j = 0; j < 5; j++) {
                pirates.get(i).work();
            }
        }
        lastDayOnTheShip();
    }
}