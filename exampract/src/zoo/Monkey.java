package zoo;

import java.util.Random;

public class Monkey extends Animal {

    public Monkey() {
    }

    public Monkey(String name) {
        super(name);
    }

    public Monkey(int age, String gender, String name) {
        super(age, gender, name);
    }

    @Override
    public boolean isHungry() {
        return new Random().nextBoolean();
    }
}
