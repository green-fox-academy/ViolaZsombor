package garden;

public class Tree {

  private String color;
  private double amountofwater;
  private double absorbwater= 0.4;

  public Tree(String color, double amountofwater) {
    this.color = color;
    this.amountofwater = amountofwater;
  }

  public String getColor() {
    return color;
  }

  public void currentwaterstatus() {
    if (amountofwater < 10) {
      System.out.println("needs water");
    } else {
      System.out.println("doesnt need water");
    }
  }

}




