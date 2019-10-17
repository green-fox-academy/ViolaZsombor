package zoo;

import java.util.Random;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class Elephant extends Animal {

    public Elephant() {
    }

    public Elephant(String name) {
        super(name);
    }

    public Elephant(int age, String gender, String name) {
        super(age, gender, name);
    }

    @Override
    public boolean isHungry() {
        Random random = new Random();
        if (random(2) % 2 == 0) {
            return true;
        } else return false;
    }
}
