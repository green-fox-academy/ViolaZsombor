import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CopyFile {

  public static void main(String[] args) {
    String fileFrom = "my-file";
    String fileTo = "my-file2";
    System.out.println(copycontent(fileFrom, fileTo));

  }

  public static boolean copycontent(String from, String to) {
    try {
      List <String> copyfrom = Files.readAllLines(Paths.get(from)); // útvonallá konvertálja a stringben megadott elérést
      Files.write(Paths.get(to), copyfrom);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful