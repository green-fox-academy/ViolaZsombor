/*Write a method which can read and parse a file containing not so family friendly text. The method must remove all the given words from the file and return the amount of the removed words.



    Input

    ['fuck', 'bloody', 'cock', 'shit', 'fucker', 'fuckstick', 'asshole', 'dick', 'piss', 'cunt']
    Output

    17*//*


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;swearPackage;

public class SwearWords {

 public static void main(String[] args) {
  String[] imputwords = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
  System.out.println(removeUnwantedWords(imputwords);
 }

 public static int removeUnwantedWords (String [] unwantedWords) {
  int result = 0;
  Path path = Paths.get("content.txt");
  List<String> lines = new ArrayList<>();
  try {
   lines = Files.readAllLines((path));  // a lines csak a try catchen belül létezik ezért: létrehozok egy listet a try előtt
   List<String> allwords = new ArrayList<>();
   String[] wordArray = new String[]
   for (int i = 0; i <lines.size() ; i++) {
    for (int j = 0; j <lines.get(i).length() ; j++) {
     allwords.add(lines.get(i).split(" ").toString());



    }


   }
  } catch (IOException e) {
   e.printStackTrace();
  }

  return result;
 }

}
*/
