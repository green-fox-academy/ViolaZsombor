package zoo;

public abstract class Animal {
    private int age;
    private int fedTimes;
    private String gender;
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
        this.age = 1;
        this.gender = "unkown";
    }

    public Animal(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void eat () {
        this.fedTimes++;
    }

    public abstract boolean isHungry();


    @Override
    public String toString(){
       return (this.name+" is a "+ this.age+" years old"+ this.gender+ "animal and was fed "+this.fedTimes +" times.");
    }
}
