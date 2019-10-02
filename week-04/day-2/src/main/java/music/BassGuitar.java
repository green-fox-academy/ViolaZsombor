package main.java.music;

public class BassGuitar extends StringedInstument {

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    this.name = "Bass Guitar";

  }

  public BassGuitar() {
    super(4 );
    this.name = "Bass Guitar";

  }

  @Override
  public String sound() {
    return  "Duum-duum-duum";
  }

  @Override
  public void play() {
    System.out.println(this.name+ "; a "+this.getNumberOfStrings()+"-stringed instrument that goes "+ this.sound());

    //Electric Guitar, a 7-stringed instrument that goes Twangg
  }
}


