package pirates;

public class Captain extends Pirate {

    public Captain() {
    }

    public Captain(int amountOfGolds, String name, boolean hasWoodenLeg) {
        super(amountOfGolds, name, hasWoodenLeg);
    }

    @Override
    public void work() {
        int tempHP = getHealthPoints();
        int tempGoldAmount = getAmountOfGolds();
        setHealthPoints(tempHP - 5);
        setAmountOfGolds(tempGoldAmount + 10);
    }

    @Override
    public void party() {
        int tempHP = getHealthPoints();
        setHealthPoints(tempHP + 10);
    }
}
