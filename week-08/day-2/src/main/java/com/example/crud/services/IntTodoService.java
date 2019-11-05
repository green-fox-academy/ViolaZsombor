package com.example.crud.services;

import com.example.crud.models.Todo;
import java.util.List;

public interface IntTodoService {
  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
}
