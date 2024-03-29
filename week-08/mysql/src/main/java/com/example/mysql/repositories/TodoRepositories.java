package com.example.mysql.repositories;


import com.example.mysql.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepositories extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDone(Boolean done);
  List<Todo> findAllByUrgentAndDone(Boolean urgent, Boolean done);
}
