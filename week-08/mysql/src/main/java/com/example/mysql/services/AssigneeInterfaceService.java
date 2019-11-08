package com.example.mysql.services;

import com.example.mysql.models.Assignee;
import java.util.List;

public interface AssigneeInterfaceService {

  List<Assignee> findAll();
  Assignee findById(long id);
  void save(Assignee assignee);
  void delete(long id);

}

