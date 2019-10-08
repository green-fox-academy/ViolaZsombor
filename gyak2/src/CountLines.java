import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CountLines {

  public static void main(String[] args) throws IOException {

   /* try {
      Path filePath = Paths.get("my-file.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i <lines.size() ; i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");*/
    System.out.println(countLines("my-file.txt"));
    }

  public static int countLines (String filename) throws IOException {
    int temp = 0;
    try {
      Path filePath = Paths.get(filename);
      List<String> lines = Files.readAllLines(filePath);
        temp+= lines.size();
        return temp;
    } catch (IOException e) {
      return 0;

    }

  }
}