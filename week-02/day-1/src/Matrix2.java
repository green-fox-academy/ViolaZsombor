import java.util.Arrays;

public class Matrix2 {

  public static void main(String[] args) {
    int[][] matrix = new int[4][4];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (i == j) {
          matrix[i][j] = 1;
        }
        System.out.print(matrix[i][j] +" ");
      }
      System.out.println();
    }
  }
}

