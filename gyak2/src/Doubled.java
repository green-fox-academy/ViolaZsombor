import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {

    decryptDoubled();

  }

  public static void decryptDoubled() {
    try {
      List<String> lines = Files.readAllLines(Paths.get("Doubled.txt"));
      ArrayList<String> decryptedline = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        String temp = "";
        for (int j = 0; j < lines.get(i).length(); j++) {
          if (j % 2 == 0) {
            temp += lines.get(i).charAt(j);

          }

        }
        decryptedline.add(temp);
      }
      Files.write(Paths.get("Doubled.txt"), decryptedline);

    } catch (IOException e) {
      e.printStackTrace();
    }
    ;

  }

}
