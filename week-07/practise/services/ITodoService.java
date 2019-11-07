package com.smgvalen.mysql.services;


import com.smgvalen.mysql.models.Todo;
import java.util.List;

public interface ITodoService {

  List<Todo> findAll();
  Iterable<Todo> findAllByDone(Boolean done);
  List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean active);
  Iterable<Todo> getFilteredData(Boolean urgent, Boolean active);
}
