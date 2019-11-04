package com.example.foxclub.models;

import java.util.List;

public class Buffalo {

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }

  public void setListOfTricks(List<String> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public Buffalo(String name, String food, String drink,
      List<String> listOfTricks) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    this.listOfTricks = listOfTricks;
  }

  private String name;
  private String food;
  private String drink;
  private List<String> listOfTricks;


}
