package com.example.mysql.services;


import com.example.mysql.models.Todo;
import com.example.mysql.repositories.TodoRepositories;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImp implements IntTodoService {

  private TodoRepositories todoRepositories;

  @Autowired
  public TodoServiceImp(TodoRepositories todoRepositories) {
    this.todoRepositories = todoRepositories;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepositories.findAll().forEach(todo -> todoList.add(todo));
    return todoList;
  }

  @Override
  public Todo findById(long id) {
    return todoRepositories.findById(id).orElse(null);
  }


  @Override
  public void save(Todo todo) {
todoRepositories.save(todo);
  }

  @Override
  public void delete(long id) {
    todoRepositories.deleteById(id);
  }
}
