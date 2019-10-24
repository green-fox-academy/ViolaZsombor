package com.greenfoxacademy.springstart;

public class Greeting {

  private long greetCount;
  private String contentField;



  public Greeting(long id, String contentField) {
    this.greetCount = id;
    this.contentField = contentField;
  }

  public long getGreetCount() {
    return greetCount;
  }

  public String getContentField() {
    return contentField;
  }
}
