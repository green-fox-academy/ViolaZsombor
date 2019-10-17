package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Pirate> pirates = new ArrayList<>();
    private int numberOfCaptain = 0;

    public Ship(List<Pirate> pirates) {
        this.pirates = pirates;
    }

    public int getGolds() {
        int totalGoldAmount = 0;
        for (int i = 0; i < pirates.size(); i++) {
            totalGoldAmount += pirates.get(i).getAmountOfGolds();
        }
        return totalGoldAmount;
    }

    public void addPirate(Pirate pirate) {
        if (pirate.getClass() != Captain.class) {
            pirates.add(pirate);
        } else if (numberOfCaptain == 0) {
            pirates.add(pirate);
            numberOfCaptain++;
        }
    }

    public List<String> getPoorPirates() {
        List<String> pirateNames = new ArrayList<>();
        for (int i = 0; i < pirates.size(); i++) {
            if ((pirates.get(i).isHasWoodenLeg()) && (pirates.get(i).getAmountOfGolds() < 15)) {
                pirateNames.add(pirates.get(i).getName());
            }
        }
        return pirateNames;
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