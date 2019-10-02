package main.java.music;

public class StringedInstument extends Instrument {

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  private int numberOfStrings;

  public StringedInstument() {
  }

  public StringedInstument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public String sound () {
    return "";
  }

}
