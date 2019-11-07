package com.example.mysql.services;


import com.example.mysql.models.Todo;
import java.util.List;

public interface IntTodoService {
  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);


  Iterable<Todo> findAllByDone(Boolean done);
  List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean active);
  Iterable<Todo> getFilteredData(Boolean urgent, Boolean active);
  List<Todo> searched(String string);

}
