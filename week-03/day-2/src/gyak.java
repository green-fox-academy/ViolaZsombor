//delete all the words from the file except the longest one

// be kell olvasni a file-t,
//vhogy szavakra bontom ami benne van
//Megkeresem melyik a leghosszabb és
//elmentem a leghosszabbat
//törlöm a többit
//aztan belementem ezt az új tartalmat a fájlba

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Paths;
import java.nio.file.Path;

public class gyak {

  public static void main(String[] args) {

//beolvasom a file-t

    Path pathName = Paths.get("src/nevek");
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(pathName);
      System.out.println();
      //minden egyes sor egy önálló list-ként szerepel

    } catch (IOException e) {
      System.out.println("nem találom");
    }

    String longestword = "";

    // szavakra bontás

    for (int i = 0; i < lines.size(); i++) {
      String[] words = lines.get(i).split("");
      String firstWord = words[0];

      //megkeresem a leghosszabbat
      if (firstWord.length() > longestword.length()) {
        longestword = firstWord;
      }
      System.out.println(longestword);
    }
  }
}