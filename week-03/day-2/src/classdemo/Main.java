package classdemo;

public class Main {

  public static void main(String[] args) {
 /*   ZigZagStudents firstStudent = new ZigZagStudents();
    firstStudent.codeMasterPoints = 20;
    firstStudent.name = "JAni";
    firstStudent.phase= 1;*/
    ZigZagStudents firststudent = new ZigZagStudents("Laca");
    ZigZagStudents secondstudent = new ZigZagStudents("Jockey");

    firststudent.askQuestions();
    String introduction = secondstudent.introduce();
    System.out.println(introduction);


  }

}
