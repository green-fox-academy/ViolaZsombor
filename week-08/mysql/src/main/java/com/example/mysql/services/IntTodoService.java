package com.example.mysql.services;


import com.example.mysql.models.Todo;
import java.util.List;

public interface IntTodoService {
  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
}
