package com.violazsombor.webshop.models;

public class ShopItem {
  private String name;
  private String description;
  private int price;
  private int quantityOfStock;

  public ShopItem(String name, String description, int price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setQuantityOfStock(int quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }
}
