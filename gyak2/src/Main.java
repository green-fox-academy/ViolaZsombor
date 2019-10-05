public class Main {

  public static void main(String[] args) {

    // - Create an integer variable named `baseNum` and assign the value `123` to it
  // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
  // - Print the result of `doubling(baseNum)`

    int baseNum = 23;
    String al = "Green fox";
    String typo = "Chinchill";

    System.out.println(doubling(baseNum)); //1. feladat
    System.out.println(greet(al)); //2. feladat
    System.out.println(appendAFunc(typo)); // 3. feladat
    System.out.println(sum(6)); // 4. feladat

  }

  public static int doubling(int inputnumber) {
    int number = inputnumber*2;
    return number;
  }

  // - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Green Fox`
// - Greet `al`

  public static String greet (String input) {
    String hello = "Greetings dear, " +input+ " !";
    return hello;
  }
  //Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string

  public static String appendAFunc (String input) {
    String functionword = input+ "a";
    return functionword;
  }

  // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

  public static int sum (int inputnumber) {
    int sum = 0;
    for (int i = 0; i <=inputnumber ; i++) {
      sum+=i;

    } return sum;


  }







}
