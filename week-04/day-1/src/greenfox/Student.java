package greenfox;

public class Student extends Person implements Cloneable {

  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  Override

  public Student clone() {
    Student student = new Student(super.getName(), super.getAge(), super.getGender(),
        previousOrganization);
    return student;


  }


  public void introduce() {
    System.out.println(
        "Hi I am " + getName() + " a " + getAge() + "year old " + getGender() + "from "
            + previousOrganization + " who skipped " + skippedDays
            + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    numberOfDays += skippedDays;
  }
}



