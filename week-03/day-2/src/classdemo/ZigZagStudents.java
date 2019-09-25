package classdemo;

//Class = tervrajz/séma/minta
//	Pl.: madár a class és veréb az instance
//	Pl.: csillagkészítő - hány db csúcs, méret, szín (lehet functionje is) s adja meg
public class ZigZagStudents {
  String name;
  int phase;
  int codeMasterPoints;

  // constructor = nincs visszatérési érték public és név között
  //feladata , a példányok létrehozása, valamint a tulajdonságaik megadása, a class program fieldjét



  public ZigZagStudents (String name) {
    this.name = name.toUpperCase();
  }

  // this = that name a classból kívülre utal, de a névütközés elkerülésére való,
  // tehát ha más a neve a constructoron belül, az adott paraméternek, akkor nem kell this
    /*  public ZigZagStudents (String name) {
        this.name = name;*/



  public ZigZagStudents ( String studentName, int phase, int points) {
    this.name = studentName;
    this.phase = phase;
    this.codeMasterPoints = points;
  }

//Function
  public String introduce () {
    return "Hi my name is " + name + ", and I am in " + phase + " phase, and i have " + codeMasterPoints+ "points";

}
public void askQuestions () {
    codeMasterPoints +=30;
}
}
// Static -> a classhoz köt valamit, nem a constructorhoz/instancehoz
// (ilyenbe a class általános minden példányra igaz tulajdonságokat alkalmaz)