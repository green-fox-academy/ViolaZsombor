package com.example.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @GetMapping(value = {"/", ""})
  public String showIndexPage(@RequestParam String name, Model model) {
    model.addAttribute("name", name );
    return "index";
  }


  @GetMapping(value = "/login")
  public String listStudent(){
    return "login";
  }

  @PostMapping (value = "/login")
  public String showLoginPage(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }
}