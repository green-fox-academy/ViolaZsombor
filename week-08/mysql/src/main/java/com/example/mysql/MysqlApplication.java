package com.example.mysql;

import com.example.mysql.controllers.TodoController;
import com.example.mysql.models.Todo;
import com.example.mysql.repositories.TodoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

  private TodoRepositories todoRepositories;

  @Autowired
  public MysqlApplication(TodoRepositories todoRepositories) {
    this.todoRepositories = todoRepositories;
  }

  public static void main(String[] args) {
    SpringApplication.run(MysqlApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    Todo todo = new Todo("matekozni");
    todoRepositories.save(new Todo("olvasni", false,false));
    todoRepositories.save(new Todo("nevetni sokat", true,true));
    todoRepositories.save(new Todo("úszni", true,false));
    todoRepositories.save(new Todo("kalózkodni", false,false));
    todoRepositories.save(todo);

  }
}
