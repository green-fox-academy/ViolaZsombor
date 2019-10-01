package garden;

public class Flower {
  private String color;
  private double amountofwater;
  private double absorbwater= 0.75;

  public Flower(String color, double amountofwater ) {
    this.color = color;
    this.amountofwater =amountofwater;
  }

  public String getColor() {
    return color;
  }


  public void currentwaterstatus() {
    if (amountofwater < 5) {
      System.out.println("needs water");
    } else {
      System.out.println("doesnt need water");
    }
  }
}
