package com.example.crud.repositories;

import com.example.crud.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepositories extends CrudRepository<Todo, Long> {

}
