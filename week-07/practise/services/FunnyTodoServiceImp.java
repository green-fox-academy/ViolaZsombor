package com.smgvalen.mysql.services;

import com.smgvalen.mysql.models.Todo;
import com.smgvalen.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class FunnyTodoServiceImp { //implements ITodoService {
  private TodoRepository repository;

  @Autowired
  public FunnyTodoServiceImp(TodoRepository repository) {
    this.repository = repository;
  }

  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    //repository.findAllFunny().forEach(todoList::add);
    return todoList;
  }
}
