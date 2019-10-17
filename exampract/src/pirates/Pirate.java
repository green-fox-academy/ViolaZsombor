package pirates;

public class Pirate {

    private int amountOfGold = 10;
    private int healthPoints = 10;
    private String name;
    private boolean hasWoodenLeg = true;

    public Pirate() {
    }

    public Pirate(int amountOfGold, int healthPoints, String name, boolean hasWoodenLeg) {
        this.amountOfGold = amountOfGold;
        this.healthPoints = healthPoints;
        this.name = name;
        this.hasWoodenLeg = hasWoodenLeg;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfGold() {
        return amountOfGold;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public boolean isHasWoodenLeg() {
        return hasWoodenLeg;
    }

    public void setAmountOfGold(int amountOfGold) {
        this.amountOfGold = amountOfGold;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setHasWoodenLeg(boolean hasWoodenLeg) {
        this.hasWoodenLeg = hasWoodenLeg;
    }

    public void work() {
        this.amountOfGold++;
        this.healthPoints--;
    }

    public void party() {
        this.healthPoints++;
    }


    public String toString() {
        if (hasWoodenLeg) {
            return "Hello I'm " + this.name + "I have a wooden leg and 20 golds";
        } else {
            return "Hello I'm " + this.name + "I still have my real legs and 20 golds.";
        }
    }
}
