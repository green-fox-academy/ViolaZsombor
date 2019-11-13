package com.example.frontend.models;

public class FirstOutput {

  private int received;
  private int result;

  public FirstOutput(int received) {
    this.received = received;
    this.result = received*2;
  }

  public FirstOutput() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
