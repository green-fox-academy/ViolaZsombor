package simba.bankofsimba.model;

public class BankAccount {

  private String name;
  private String animalType;
  private int balance;
  private boolean isKing;
  private boolean isBadguy;

  public BankAccount(String name, String animalType, int balance, boolean isKing,
      boolean isBadguy) {
    this.name = name;
    this.animalType = animalType;
    this.balance = balance;
    this.isKing = isKing;
    this.isBadguy = isBadguy;
  }

  public boolean isBadguy() {
    return isBadguy;
  }

  public void setBadguy(boolean badguy) {
    isBadguy = badguy;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }


  public BankAccount() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public int getBalance() {
    return balance;
  }
}
