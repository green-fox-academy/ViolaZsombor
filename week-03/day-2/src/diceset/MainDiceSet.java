package diceset;

public class MainDiceSet {

  public static void main(String[] args) {
    DiceSet diceSet = new DiceSet();
    int counter = 1;

    diceSet.roll();
    diceSet.printnumbers();
    for (int i = 0; i <6 ; i++) {
      while (diceSet.getCurrent(i) != 6) {
        diceSet.reroll(i);

        System.out.println(counter++);
        diceSet.printnumbers();

    }


    }


  }
}