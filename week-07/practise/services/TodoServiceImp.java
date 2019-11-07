package com.smgvalen.mysql.services;

import com.smgvalen.mysql.models.Todo;
import com.smgvalen.mysql.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImp implements ITodoService {

  private TodoRepository repository;

  @Autowired
  public TodoServiceImp(TodoRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    repository.findAll().forEach(todoList::add);
    return todoList;
  }

  @Override
  public Iterable<Todo> findAllByDone(Boolean done) {
    if (done != null) {
      return repository.findAllByDone(!done);
    } else {
      return repository.findAll();
    }
  }

  @Override
  public List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean active) {
    return repository.findAllByUrgentAndDone(urgent, !active);
  }

  @Override
  public Iterable<Todo> getFilteredData(Boolean urgent, Boolean active){
    if (urgent == null && active == null){
      return repository.findAll();
    } else if (urgent == null && active == null) {
      return repository.findAllByUrgentAndDone(urgent, !active);
    }

    return new ArrayList<Todo>();
  }
}
