package com.example.rielpractiseproject.controllers;

import com.example.rielpractiseproject.models.Product;
import com.example.rielpractiseproject.services.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

  private ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping(value = "/")
  public String renderName(Model model) {
    model.addAttribute("items", productService.getItems());
    return "main";
  }


  @PostMapping(value = "/filtered")
  public String renderFiltered(Model model, @RequestParam int quantity) {
    model.addAttribute("items", productService.getFiltered(quantity));
    return "main";
  }

  @GetMapping(value = "/add")
  public String add(Model model) {
    model.addAttribute("item", new Product());
    return "add";
  }

  @PostMapping(value = "/add")
  public String addNewModel(@ModelAttribute Product item) {
    productService.addItem(item);
    return "redirect:/";
  }
}