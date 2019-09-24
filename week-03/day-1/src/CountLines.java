import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {

  public static void main(String[] args) {
    String file = "my-file";
    linenumberfuinction(file);
  }

  public static void linenumberfuinction(String filename) {
    try {
      Path filepath = Paths.get(filename);
      List<String> lines = Files.readAllLines(filepath);
      System.out.println(lines.size());
    } catch (Exception e) {
      System.out.println("zero");
    }
  }
}

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
