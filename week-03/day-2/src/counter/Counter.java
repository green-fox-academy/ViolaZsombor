package counter;

public class Counter {

  int fieldvalue = 0;
  int initialvalue = 0;

  public Counter () {

  }

  public Counter (int number){
    fieldvalue =number;
    initialvalue=number;
  }

  public int add(int number) {
    return  fieldvalue += number;
  }

  public int add() {
    return fieldvalue++;
  }

  public int get() {
    return  fieldvalue;
  }
  public int reset () {
    return fieldvalue = initialvalue;
  }
}


