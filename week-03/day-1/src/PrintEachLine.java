import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {

  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("C:\\Users\\Csoszi\\greenfox\\ViolaZsombor\\week-03\\day-1\\my-file");

      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}

// Write a program that opens a file called "my-file.txt", then prints
// each line from the file.
// If the program is unable to read the file (for example it does not exist),
// then it should print the following error message: "Unable to read file: my-file.txt"