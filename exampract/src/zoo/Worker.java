package zoo;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private List<Animal> animalsToLookAfter = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name) {
        this.name = name;
        this.animalsToLookAfter.isEmpty();
    }

    public Worker(String name, List<Animal> animalsToLookAfter) {
        this.name = name;
        this.animalsToLookAfter = animalsToLookAfter;
    }

    public void doDailyRoutine() {
        for (int i = 0; i < animalsToLookAfter.size(); i++) {
            if (animalsToLookAfter.get(i).isHungry()) {
                animalsToLookAfter.get(i).eat();
            }
        }
    }
}
