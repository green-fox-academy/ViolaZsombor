package postit;

import java.awt.Color;

public class Main {

  public static void main(String[] args) {
    PostIt firstpostit = new PostIt(Color.cyan, "ablak", Color.BLUE);
    System.out.println(firstpostit.text);
    System.out.println(firstpostit.backgroundcolor);
    System.out.println(firstpostit.textcolor);

    PostIt secondpostit = new PostIt(Color.green, "kutya", Color.gray);
    System.out.println(secondpostit.text);
    System.out.println(secondpostit.backgroundcolor);
    System.out.println(secondpostit.textcolor);
  }
}





