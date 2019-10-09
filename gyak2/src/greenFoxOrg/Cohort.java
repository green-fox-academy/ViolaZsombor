package greenFoxOrg;

import java.util.List;

public class Cohort {

  String name;
  List<Student> students = (List<Student>) new Student();
  List<Mentor> mentors = (List<Mentor>) new Mentor();

  public Cohort(String name) {
    this.name = name;
    mentors.isEmpty();
    students.isEmpty();

  }

  public void addStudent(Student newstudent) {
    students.add(newstudent);
  }

  public void addMentor(Mentor newmentor) {
    mentors.add(newmentor);
  }

  public void info() {
    System.out.println(
        "The " + name + " cohort has " + students.size() + "students and " + mentors.size()
            + " mentors.");
  }

}
