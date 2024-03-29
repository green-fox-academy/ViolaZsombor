package com.example.mysql.controllers;

import com.example.mysql.models.Todo;
import com.example.mysql.services.IntTodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  private IntTodoService intTodoService;

  @Autowired
  public TodoController(IntTodoService intTodoService) {
    this.intTodoService = intTodoService;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(required = false) Boolean isActive,
      @RequestParam(required = false) Boolean urgent) {
    model.addAttribute("todos", intTodoService.getFilteredData(urgent, isActive));
    return "todolist";
  }

  @PostMapping(value = "/search")
  public String search(@RequestParam(name = "search") String search, Model model) {
    model.addAttribute("todos", intTodoService.searched(search));
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String addGet(@ModelAttribute Todo todo) {
    return "add";
  }

  @PostMapping(value = "/add")
  public String add(@ModelAttribute Todo todo) {
    intTodoService.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/delete/{id}")
  public String delete(@PathVariable(name = "id") Long id) {
    intTodoService.delete(id);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/edit/{id}")
  public String edit(Model model, @PathVariable(name = "id") Long id) {
    model.addAttribute("editedTodo", intTodoService.findById(id));
    return "edit";
  }

  @PostMapping(value = "/{editedId}/edit")
  public String edit(@ModelAttribute Todo edited , @PathVariable(name = "editedId") Long newId) {
    edited.setId(newId);
    intTodoService.save(edited);
    return "redirect:/todo/list";
  }
}