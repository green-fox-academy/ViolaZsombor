package simba.bankofsimba.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import simba.bankofsimba.model.BankAccount;

@Controller
public class BankAccountController {

  private List<BankAccount> bankAccounts = new ArrayList<>();

  public BankAccountController() {
    bankAccounts.add(new BankAccount("Simba", "lion", 2000, true, false));
    bankAccounts.add(new BankAccount("Nala", "lion", 1000, false, false));
    bankAccounts.add(new BankAccount("Pumpa", "pig", 3333, false, true));
    bankAccounts.add(new BankAccount("Timon", "meerkat", 500, false, false));
    bankAccounts.add(new BankAccount("Mufasa", "lion", 0, true, false));
  }

  @GetMapping(value = {"/", ""})
  public String indexPage(Model model) {
    model.addAttribute("accountList", bankAccounts);
    return "index";
  }

  @GetMapping(value = {"/enjoy"})
  public String enjoy(Model model) {
    model.addAttribute("text", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
    return "enjoy";
  }

  @GetMapping(value = "/add")
  public String addNewAccount(@ModelAttribute(name = "account") BankAccount accountToAdd,
      Model model) {
    model.addAttribute("newAccount", accountToAdd);
    return "add";
  }

  @PostMapping(value = "/addmoney")
  public String raisemoney(Model model, @RequestParam int animalIndex) {
    if (bankAccounts.get(animalIndex).isKing()) {
      bankAccounts.get(animalIndex).setBalance(bankAccounts.get(animalIndex).getBalance() + 100);
    } else {
      bankAccounts.get(animalIndex).setBalance(bankAccounts.get(animalIndex).getBalance() + 10);
    }
    return "redirect:/";
  }
}
