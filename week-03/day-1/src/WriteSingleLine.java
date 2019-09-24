import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

  public static void main(String[] args) {
    String file = "my-file";
    writelinefunciton(file);

  }

  public static void writelinefunciton(String input) {

    List<String> content = new ArrayList<>();
    String myname = "Viola Zsombor";
    content.add(myname);

    try {
      Path filePath = Paths.get(input);
      Files.write(filePath, content);

    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
  }

// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"