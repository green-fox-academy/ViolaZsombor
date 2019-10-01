package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    Collections.sort(dominoes);
    System.out.println(dominoes);

    List fleet = new ArrayList();

    Thing first =new Thing("Get milk");
    Thing second = new Thing("Remove the obstacles");
    Thing third = new Thing("Stand up");
    Thing fourth = new Thing("Eat lunch");
    third.complete();
    fourth.complete();
    fleet.add(first);
    fleet.add(second);
    fleet.add(third);
    fleet.add(fourth);

    Collections.sort(fleet);
    System.out.println(fleet);
  }

  }


