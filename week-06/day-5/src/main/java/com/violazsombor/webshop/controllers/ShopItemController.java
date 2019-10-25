package com.violazsombor.webshop.controllers;

import com.violazsombor.webshop.models.ShopItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopItemController {

  private List<ShopItem> shopItems = new ArrayList();

  public ShopItemController (){
    shopItems.add(new ShopItem("Running shoes","Nike running shoes",1000,5));
    shopItems.add(new ShopItem("Printer","Some Hp printer that will print",3000,2));
    shopItems.add(new ShopItem("Coca-cola","0,5L standard coke",25,0));
    shopItems.add(new ShopItem("Wokin","Chicken with fried rice",119,100));
    shopItems.add(new ShopItem("T-shirt","blue with a corgi",300,1));
  }


  @GetMapping(value = "/shopItems")
  public String listItems (Model model) {
    model.addAttribute("items", shopItems); //attributName $(attributname a htmlben)
    return "list"; //a html fájl neve amit keres
  }

}

