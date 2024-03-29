package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




  @Controller
  public class HelloToAllWorld {


    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
        "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
        "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló",
        "Helló",
        "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
        "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
        "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
        "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae",
        "Sholem Aleychem",
        "Sawubona"};


    @RequestMapping(value = "/web/helloworld2")
    public String hellomaker(@RequestParam String color, @RequestParam String font, Model model) {
      model.addAttribute("color", "color: " + color);
      model.addAttribute("font", "font-size: " + font);
      model.addAttribute("hello", hellos[5]);

      return "helloWorld";
    }
  }




