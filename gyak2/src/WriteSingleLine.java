import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteSingleLine {

  public static void main(String[] args) {
    writeALineToFile();

  }
  public static void writeALineToFile() {
    ArrayList<String> name = new ArrayList<>();
    name.add("Viola dddd");
    try {
      Path filePath = Paths.get("my-file.txt");
      Files.write(filePath, name);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
