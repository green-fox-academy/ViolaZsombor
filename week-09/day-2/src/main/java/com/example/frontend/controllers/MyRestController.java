package com.example.frontend.controllers;

import com.example.frontend.models.AppendA;
import com.example.frontend.models.ArrayInput;
import com.example.frontend.models.ArrayInputResult;
import com.example.frontend.models.ArrayListInputResult;
import com.example.frontend.models.FirstOutput;
import com.example.frontend.models.Person;
import com.example.frontend.models.MyError;
import com.example.frontend.models.UntilInput;
import com.example.frontend.models.UntilResult;
import com.example.frontend.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

  private MainService mainService;

  @Autowired
  public MyRestController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping(value = "/doubling")
  public ResponseEntity<Object> doubleInput(@RequestParam(required = false) Integer input) {
    if (input != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new FirstOutput(input));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("Please provide an input!"));
    }
  }

  @GetMapping(value = "/greeter")
  public ResponseEntity<Object> welcome(@RequestParam(required = false) String name,
      @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("Please provide a name and a title!"));
    } else if (name != null && title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("Please provide a title!"));
    } else if (name == null && title != null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("Please provide a name!"));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new Person(name, title));
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public ResponseEntity<Object> appendAnA(@PathVariable String appendable) {
    if (appendable == null) {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
      // ha nem adunk vissza szöveges error messaget , akkor nem kell .status(HttpStatus.BAD_REQUEST)
      //          .body rész
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new AppendA(appendable));
    }
  }

  @PostMapping(value = "/dountil/{action}")
  public ResponseEntity<Object> doUntilendpoint(@PathVariable String action, @RequestBody
      UntilInput untilinput) {
    if (action.equals("factor")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new UntilResult(mainService.factor(untilinput.getUntil())));
    } else if (action.equals("sum")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new UntilResult(mainService.sum(untilinput.getUntil())));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("Please provide a number!"));

    }
  }

  @PostMapping(value = "/arrays")
  public ResponseEntity<Object> arrayEndpoint(@RequestBody ArrayInput arrayInput) {
    if (arrayInput.getWhat() == null || arrayInput.getNumbers() == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("Please provide what to do with the numbers!"));
    } else if (arrayInput.getWhat().equals("sum")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new ArrayInputResult(mainService.sumArray(arrayInput.getNumbers())));
    } else if (arrayInput.getWhat().equals("multiply")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new ArrayInputResult(mainService.multiplyArray(arrayInput.getNumbers())));
    } else if (arrayInput.getWhat().equals("double")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new ArrayListInputResult(mainService.doubleArray(arrayInput.getNumbers())));
    } else {
      return new ResponseEntity (HttpStatus.BAD_REQUEST);
    }
  }
}