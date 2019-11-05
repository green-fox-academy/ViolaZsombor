package com.example.crud;

import com.example.crud.models.Todo;
import com.example.crud.repositories.TodoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

  private TodoRepositories todoRepositories;

  @Autowired
  public CrudApplication(TodoRepositories todoRepositories) {
    this.todoRepositories = todoRepositories;
  }

  public static void main(String[] args) {
    SpringApplication.run(CrudApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepositories.save((new Todo(1, "I have to learn Object Relational Mapping", false, false)));
    todoRepositories.save((new Todo(2, "Go Hawaii", false, false)));
    todoRepositories.save((new Todo(3, "Learn magic", true, false)));
  }
}
