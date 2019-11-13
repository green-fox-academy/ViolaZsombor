package com.example.frontend.models;

import java.util.List;

public class LogOutput {

  private int entry_count;
  private List<LogInput> entries;

  public LogOutput() {
  }

  public LogOutput(int entry_count, List<LogInput> entries) {
    this.entry_count = entry_count;
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }

  public List<LogInput> getEntries() {
    return entries;
  }

  public void setEntries(List<LogInput> entries) {
    this.entries = entries;
  }
}
