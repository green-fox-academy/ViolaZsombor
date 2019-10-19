package animalprotection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalShelter {
    //It must have a budget, an animals list, an adopters name list
    //The shelter starts with 50€ without any Animal and adopter

    //It must have a method named rescue this method takes an Animal as parameter
    //and add the animal to the shelter's list and return the size of the list


    //It must have a method named addAdopter this method takes a name as a parameter
    //and saves it as a potential new owner

    //It must have a method named earnDonation this method takes an amount as parameter
    //and increases the shelter's budget by the parameter's value and returns the current budget
    //It must have a method named toString that represents the shelter
    //and print all the informations about the shelter and the animals in the following format:

    private int budget = 50;
    private List<Animal> animals = new ArrayList<>();
    private List<String> adopterNames = new ArrayList<>();

    public int rescue(Animal animal) {
        this.animals.add(animal);
        return animals.size();
    }

    //It must have a method named heal this method heals the first not healthy Animal
    //if it is possible by budget, returns the amount of healed animals(0 or 1)
    public int heal() {
        for (int i = 0; i < animals.size(); i++) {
      /*Animal animal = this.animals.get(i);
      if (!animal.isIshealthy() && this.budget >= animal.getHealCost()){
        budget-=animal.getHealCost();
        animal.heal();
        return 1;
      }
    }*/

            for (Animal animal : animals) {
                if (!animal.isIshealthy() && this.budget >= animal.getHealCost()) {
                    this.budget -= animal.getHealCost();
                    animal.heal();
                    return 1;
                }
            }
        }
        return 0;
    }

    //It must have a method named findNewOwner
    //this method pairs a random name with a random adoptable Animal if it is possible
    //and removes both of them from the lists
    public void findNewOwner() {
        List<Animal> adoptableAnimals = new ArrayList<>();
        for (Animal animal : this.animals) {
            if (animal.isAdoptable()) {
                adoptableAnimals.add(animal);
            }
        }

        if (adoptableAnimals.size() == 0 || adopterNames.size() == 0) {
            return;
        }

        Random random = new Random();
        int animalIndex = random.nextInt(adoptableAnimals.size());
        Animal animalToBeAdopted = adoptableAnimals.get(animalIndex);
        animals.remove(animalToBeAdopted);

        int ownerIndex = random.nextInt(adopterNames.size());
        animalToBeAdopted.setOwnerName(adopterNames.get(ownerIndex));
        adopterNames.remove(ownerIndex);
    }
}