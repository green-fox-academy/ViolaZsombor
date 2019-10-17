package pirates;

public class Pirate {
    private int amountOfGolds;
    private int healthPoints = 10;
    private String name;
    private boolean hasWoodenLeg = true;

    public Pirate() {
    }

    public Pirate(int amountOfGolds, String name, boolean hasWoodenLeg) {
        this.amountOfGolds = amountOfGolds;
        this.name = name;
        this.hasWoodenLeg = hasWoodenLeg;
    }

    public int getAmountOfGolds() {
        return amountOfGolds;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public boolean isHasWoodenLeg() {
        return hasWoodenLeg;
    }

    public void setAmountOfGolds(int amountOfGolds) {
        this.amountOfGolds = amountOfGolds;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHasWoodenLeg(boolean hasWoodenLeg) {
        this.hasWoodenLeg = hasWoodenLeg;
    }

    public void work() {
        this.amountOfGolds++;
        this.healthPoints--;
    }

    public void party() {
        this.healthPoints++;
    }

    public String toString() {
        if (hasWoodenLeg) {
            return ("Hello I am " + this.name + ". I have a wooden leg and " + amountOfGolds + " golds.");
        } else {
            return ("Hello I am " + this.name + ". I still have my real legs and " + amountOfGolds + " golds.");
        }
    }
}
