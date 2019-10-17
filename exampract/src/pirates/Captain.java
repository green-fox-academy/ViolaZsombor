package pirates;

public class Captain extends Pirate {

    public Captain() {
    }

    public Captain(int amountOfGold, int healthPoints, String name, boolean hasWoodenLeg) {
        super(amountOfGold, healthPoints, name, hasWoodenLeg);
    }

    @Override
    public void work() {
        int tempHp = getHealthPoints();
        int tempGoldAmount= getAmountOfGold();
        setHealthPoints(tempHp-5);
        setAmountOfGold(tempGoldAmount+10);
    }

    @Override
    public void party() {
        int tempHp = getHealthPoints();
        setHealthPoints(tempHp+10);
    }
}
