package com.example.frontend.models;

public class AppendA {

  private String appended;

  public AppendA(String appended) {
    this.appended = appended+"a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

}
