package main.java.music;

public class ElectricGuitar extends StringedInstument {


  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    this.name = "Electric Guitar";
  }

  public ElectricGuitar() {
    super(6);
    this.name = "Electric Guitar";

  }

  @Override
  public String sound() {
    return "Twang";
  }

  @Override
  public void play() {
    System.out.println(
        this.name + "; a " + this.getNumberOfStrings() + "-stringed instrument that goes " + this
            .sound());

    //Electric Guitar, a 7-stringed instrument that goes Twangg
  }
}
