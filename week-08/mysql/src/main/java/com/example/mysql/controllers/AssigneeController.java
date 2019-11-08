package com.example.mysql.controllers;

import com.example.mysql.models.Assignee;
import com.example.mysql.services.AssigneeInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/assignee") // az összes többi endpointot az itt megadott value előzi meg az url sávban
public class AssigneeController {

  private AssigneeInterfaceService assigneeInterfaceService;

  @Autowired
  public AssigneeController(
      AssigneeInterfaceService assigneeInterfaceService) {
    this.assigneeInterfaceService = assigneeInterfaceService;
  }

  @GetMapping(value = "/list")
  public String assigneeList(Model model){
    model.addAttribute("assignees", assigneeInterfaceService.findAll());
    return "assigneelist";
  }

  @GetMapping(value = "/edit/{id}")
  public String editAssignees(Model model, @PathVariable(name="id") Long id){
    model.addAttribute("editedAssignee", assigneeInterfaceService.findById(id) );
    return "editList";
  }

  @PostMapping(value = "/{editedId}/edit")
  public String edit(@ModelAttribute Assignee edited , @PathVariable(name = "editedId") Long newId) {
    edited.setId(newId);
    assigneeInterfaceService.save(edited);
    return "redirect:/assignee/list";
  }
}
