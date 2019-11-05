package com.example.crud.controllers;

import com.example.crud.services.IntTodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  private IntTodoService intTodoService;

  @Autowired
  public TodoController(IntTodoService intTodoService) {
    this.intTodoService = intTodoService;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", intTodoService.findAll());
    return "todolist";
  }
}
