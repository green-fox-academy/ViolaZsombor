package zoo;

public class Lion extends Animal {

    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }

    public Lion(int age, String gender, String name) {
        super(age, gender, name);
    }

    @Override
    public boolean isHungry() {
        return true;
    }
}
