package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  AtomicLong idcounter = new AtomicLong();



  @RequestMapping(value = "/greeting")
  public Greeting greetingmaker (@RequestParam String name) {
    return new Greeting(idcounter.incrementAndGet(),"Hello "+name+"!");

  }
}
