package com.example.helloworld;

import com.example.helloworld.services.MyColor;
import com.example.helloworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor color;

  @Autowired
  public HelloworldApplication(Printer printer, @Qualifier("red") MyColor myColor) {
    this.printer = printer;
    this.color = myColor;
  }


  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("haliho");
    color.printColor();

  }
}
