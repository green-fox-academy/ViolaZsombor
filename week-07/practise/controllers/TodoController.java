package com.smgvalen.mysql.controllers;

import com.smgvalen.mysql.models.Todo;
import com.smgvalen.mysql.services.ITodoService;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  private ITodoService service;

  @Autowired
  public TodoController(ITodoService service){
    this.service = service;
  }

  @GetMapping (value= {"/", "/list"})
  public String list(Model model, @RequestParam(required = false) Boolean isActive, @RequestParam(required = false) Boolean urgent  ) {
    //List<Todo> activeTodos = service.findAllByDone(!isActive).stream().collect(Collectors.toList());
    //model.addAttribute("todos", service.findAllByDone(isActive));
    //model.addAttribute("todos", service.findAllByUrgentAndDone(urgent, isActive));
    model.addAttribute("todos", service.getFilteredData(urgent, isActive));

    return "todolist";
  }
}

