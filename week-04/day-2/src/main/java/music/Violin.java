package main.java.music;

public class Violin extends StringedInstument {

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    this.name = "Violin";

  }

  public Violin() {
    super(4);
    this.name = "Violin";

  }

  @Override
  public String sound() {
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println(
        this.name + "; a " + this.getNumberOfStrings() + "-stringed instrument that goes " + this
            .sound());
  }
}
