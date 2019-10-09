package greenFoxOrg;

public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;


  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public void introduce() {
    System.out.println(
        "Hi I am " + getName() + " a " + getAge() + " year old " + getGender() + " from "
            + previousOrganization + " who skipped " + skippedDays + " days from the course");
  }

  public int skipDays(int numberOfDays) {
    numberOfDays += this.skippedDays;
    return skippedDays;
  }
}
