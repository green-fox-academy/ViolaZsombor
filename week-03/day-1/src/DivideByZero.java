// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0


import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {

    divideFunction(0);
  }
  public static void divideFunction(int number) {
    try {
      int result = 10 / number;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail, you can't divide with 0!");


    }
  }
}


