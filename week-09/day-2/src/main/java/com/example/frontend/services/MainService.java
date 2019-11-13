package com.example.frontend.services;

import org.springframework.stereotype.Service;

@Service
public class MainService {

  public int sum(int input) {
    int out = 0;
    for (int i = 0; i < input + 1; i++) {
      out += i;
    }
    return out;
  }

  public int factor(int input) {
    int number = 1;
    for (int i = 1; i <= input; i++) {
      number *= i;
    }
    return number;
  }

  public int multiplyArray(int[] input) {
    int number = 1;
    for (int i = 0; i < input.length; i++) {
      number *= input[i];
    }
    return number;
  }

  public int sumArray(int[] input) {
    int number = 0;
    for (int i = 0; i < input.length; i++) {
      number += input[i];
    }
    return number;
  }

  public int[] doubleArray(int [] input) {
    for (int i = 0; i <input.length ; i++) {
      input[i]=input[i]*2;
    }
    return input;
  }
}

