// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[][] matrix = new int[4][4];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (i == j) {
          matrix[i][j] = 1;
        } else {
          matrix[i][j] = 0;
        }
        System.out.print("\t" + matrix[i][j]);

      }
      System.out.println();
    }
    int[] numList = new int[]{3, 4, 5, 6, 7};
    for (int i = 0; i < numList.length; i++) {
      numList[i] *= 2;

      System.out.print(" " + numList[i]);
    }
    System.out.println();
    System.out.println("---------------------------------------------------");
    // - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`

    String[][] colors = {
        {"lime", "forest green", "olive", "pale green", "spring green"},
        {"orange red", "red", "tomato"},
        {"orchid", "violet", "pink", "hot pink"},
    };

    // - Create an array variable named `animals`
    //   with the following content: `["koal", "pand", "zebr"]`
    // - Add all elements an `"a"` at the end

    String[] animals = new String[]{"koal", "pand", "zebr"};
    for (int i = 0; i < animals.length; i++) {
      animals[i] += "a";
      System.out.println(animals[i]);
    }
    System.out.println("---------------------------------------------------");

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

    String[] abc = new String[]{"first", "second", "third"};
    String temp;
    temp = abc[2];
    abc[2] = abc[0];
    abc[0] = temp;
    System.out.println(abc[0] + " and " + abc[2]);

    System.out.println("---------------------------------------------------");

// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`

    int[] ai = new int[]{3, 4, 5, 6, 7};
    int sum = 0;

    for (int i = 0; i < ai.length; i++) {
      sum += ai[i];

    }
    System.out.println(sum);

    System.out.println("---------------------------------------------------");

    // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
    int[] aj = new int[]{3, 4, 5, 6, 7};
    int[] tempp = new int[aj.length];

    for (int i = 0; i < aj.length; i++) {
      tempp[i] = aj[aj.length - 1 - i];
    }
    for (int j : tempp) {
      System.out.print(j+ " ");
    }
  }
}





