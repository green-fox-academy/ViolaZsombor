package com.example.practise2.controller;

import com.example.practise2.model.BankAccount;
import com.example.practise2.model.BankAccount;
import com.sun.org.apache.xpath.internal.operations.Mod;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankAccountController {

  private List<BankAccount> accounts = new ArrayList<>();

  public BankAccountController() {
    accounts.add(new BankAccount("Simba", "lion", 2000, true, false));
    accounts.add(new BankAccount("Lionelala", "lion", 2356, false, true));
    accounts.add(new BankAccount("Pumba", "pig", 1000, false, false));
    accounts.add(new BankAccount("Mufasa", "lion", 20, true, false));
  }


  @GetMapping(value = "/show")
  public String showAccounts(Model model) {
    BankAccount Simba = new BankAccount("Simba", "lion", 2000);
    model.addAttribute("keymodel", Simba);
    return "index";
  }

  @GetMapping(value = "/html")
  public String showHtmlTrick(Model model) {
    model.addAttribute("trick", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmltrick";
  }

  @GetMapping(value = "/list")
  public String showList(Model model) {
    model.addAttribute("listofanimals", accounts);
    return "list";
  }

  @PostMapping(value = "/addmoney")
  public String addMoney(Model model, @RequestParam int index) {
    if (accounts.get(index).isKing()) {
      accounts.get(index).setBalance(accounts.get(index).getBalance() + 100);
    } else {
      accounts.get(index).setBalance(accounts.get(index).getBalance() + 10);
    }
    return "redirect:/list";
  }
}