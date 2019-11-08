package com.example.mysql.services;

import com.example.mysql.models.Assignee;
import com.example.mysql.repositories.AssigneeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService implements AssigneeInterfaceService {

  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> findAll() {
    List<Assignee> assigneeList = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignee -> assigneeList.add(assignee));
    return assigneeList;
  }

  @Override
  public Assignee findById(long id) {
    return assigneeRepository.findById(id).orElse(null);
  }

  @Override
  public void save(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public void delete(long id) {
    assigneeRepository.deleteById(id);
  }
}
