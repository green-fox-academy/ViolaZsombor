package animalprotection;

//It must have ownerName and stores it's health's state isHealthy (true or false) and a healCost.
//It must have a method named heal(), that sets the isHealthy field's status to true
//It must have a method named isAdoptable that returns a boolean value whether it can be adopted or not - an animal can be adopted if it is healthy

//It must have a method named toString() that represents the Animal in the following format:
//<name> is not healthy (<heal cost>€), and not adoptable
//<name> is healthy, and adoptable

//The animal's name is the same as the class name by default, but it can be set trough constructor as well
public class Animal {
    private String ownerName;
    private boolean ishealthy;
    private int healCost;
    private String name;

    public Animal(boolean ishealthy, String name) {
        this.ishealthy = ishealthy;
        this.name = name;
    }

    public Animal(boolean ishealthy) {
        this.ishealthy = ishealthy;
        this.name = "Animal";
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getHealCost() {
        return healCost;
    }


    public boolean isIshealthy() {
        return ishealthy;
    }

    public boolean isAdoptable(){
        return this.ishealthy;
    }

    public void heal(){
        this.ishealthy = true;
    }

    @Override
    public String toString(){
        if (this.ishealthy){
            return this.name + "is healthy, and adoptable";
        } else {
            return this.name + "is not healthy (" + healCost + "€), and not adoptable";
        }
    }
}