package greenfox;

public class Mentor extends Person {

  private String level;

  public Mentor() {
    this.level= "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    super();
    this.level = level;
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println(
        "Hi I am " + getName() + " a " + getAge() + " year old " + getGender() + level + " mentor.");
  }


}
