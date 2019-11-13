package com.example.mysql.services;


import com.example.mysql.models.Todo;
import java.util.List;

public interface IntTodoService {
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
  void add (Todo todo);
  List<Todo> findAll(); //+1


  Iterable<Todo> findAllByDone(Boolean done);
  List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean active);
  Iterable<Todo> getFilteredData(Boolean urgent, Boolean active);
  List<Todo> searched(String string);

}
