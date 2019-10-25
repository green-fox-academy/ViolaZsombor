package greenfox;

public class Sponsor extends Person {

  private String company;
  private int hiredStudents;


  public Sponsor(String name, int age, String gender, String company) {
    super();
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public void introduce() {
    System.out.println(
        "Hi I am " + getName() + "a " + getAge() + " year old " + getGender() + " who represent"
            + company + " and hired " + hiredStudents + " so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
