package com.example.practise2.model;

public class BankAccount {

  private String name;
  private String animalType;
  private int balance;
  private boolean isKing;

  public BankAccount(String name, String animalType, int balance, boolean isKing,
      boolean isBadGuy) {
    this.name = name;
    this.animalType = animalType;
    this.balance = balance;
    this.isKing = isKing;
    this.isBadGuy = isBadGuy;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public boolean isBadGuy() {
    return isBadGuy;
  }

  public void setBadGuy(boolean badGuy) {
    isBadGuy = badGuy;
  }

  private boolean isBadGuy;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public BankAccount(String name, String animalType, int balance) {
    this.name = name;
    this.animalType = animalType;
    this.balance = balance;
  }

  public BankAccount() {
  }
}
