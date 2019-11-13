package com.example.mysql;

import com.example.mysql.controllers.TodoController;
import com.example.mysql.models.Assignee;
import com.example.mysql.models.Todo;
import com.example.mysql.repositories.AssigneeRepository;
import com.example.mysql.repositories.TodoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

  private TodoRepositories todoRepositories;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public MysqlApplication(TodoRepositories todoRepositories,
      AssigneeRepository assigneeRepository) {
    this.todoRepositories = todoRepositories;
    this.assigneeRepository = assigneeRepository;
  }


  public static void main(String[] args) {
    SpringApplication.run(MysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Todo todo = new Todo("matekozni");
    todoRepositories.save(todo);
    todoRepositories.save(new Todo("olvasni", false,false));
    todoRepositories.save(new Todo("nevetni sokat", true,true));
    todoRepositories.save(new Todo("úszni", true,false));
    todoRepositories.save(new Todo("kalózkodni", false,false));


    assigneeRepository.save(new Assignee("Jockey","jockey@dallas.com"));
    assigneeRepository.save(new Assignee("Bobby","bobby@dallas.com"));

    Assignee assignee = new Assignee("Jimmy", "jimmy@dallas.com");


    assignee.addTodo(todo);



  }
}
