public class matrix90toright {

  public static void main(String[] args) {
  run();

  }

  public static void run() {

    int[][] mat = new int[][]{
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
    };

    System.out.println("Before:");
    for (int[] array : mat) {
      for (int i : array) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

    System.out.println();

    int size = mat.length;
    for (int x = 0; x < size / 2; x++) {

      for (int y = x; y < size - x - 1; y++) {

        int nx = size - 1 - x;
        int ny = size - 1 - y;

        int swapVal = mat[x][y];

        mat[x][y] = mat[ny][x];

        mat[ny][x] = mat[nx][ny];

        mat[nx][ny] = mat[y][nx];

        mat[y][nx] = swapVal;
      }
    }

    System.out.println("After:");
    for (int[] array : mat) {
      for (int i : array) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}






