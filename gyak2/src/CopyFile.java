// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

  public static void main(String[] args) {
    Path fileFrom = Paths.get("my-file.txt");
    Path fileto = Paths.get("copyto.txt");
    System.out.println(copyFile("my-file.txt", "copyto.txt"));
  }

  public static boolean copyFile(String from, String to) {
    try {
      List<String> lines = Files.readAllLines(Paths.get(from));
      Files.write(Paths.get(to), lines);
      return true;
    } catch (IOException e) {
      return false;
    }

  }
}
