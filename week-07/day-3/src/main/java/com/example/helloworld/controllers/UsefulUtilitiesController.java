package com.example.helloworld.controllers;

import com.example.helloworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {

  UtilityService utilityService;

  @Autowired
  public UsefulUtilitiesController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String showUsefulUtilities() {
    return "index";
  }

  @GetMapping("/useful/colored")
  public String showColor(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "color";
  }

  @PostMapping("/useful/email")
  public String checkEmail (@RequestParam  String emailCheck, Model model ) {
    model.addAttribute("email", emailCheck);
    model.addAttribute("isValid", utilityService.validateEmail(emailCheck));
    return "emailcheck";
  }





}


