package com.example.mysql.repositories;


import com.example.mysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepositories extends CrudRepository<Todo, Long> {

}
