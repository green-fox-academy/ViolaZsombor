public class gyak22 {

  public static void main(String[] args) {
    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    String url = "https//www.reddit.com/r/nevertellmethebots";

    String newurl =  url.replace("s","s:").replace("bots", "odds");
    System.out.println(newurl);

    System.out.println("---------------------------");

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String missinwords = "always takes longer than ";
    int whereitstart = quote.indexOf("you");

    StringBuilder missingpart = new StringBuilder(quote);  // quote: az, amivel mókolni szeretnék
    missingpart.insert(whereitstart,missinwords);

    System.out.println(missingpart);

    System.out.println("---------------------------");

    /*
     Add "My tod o: " to the beginning of the todoText
     Add " - Download games" to the end of the todoText
     Add " - Diablo" to the end of the todoText but with indention
     My todo:
      - Buy milk
      - Download games
          - Diablo
    */
    String mytodo = "-Buy milk\n";
    StringBuilder stringBuilder = new StringBuilder(mytodo);
    mytodo= String.valueOf(stringBuilder.insert(0,"My todo: \n").append("-Download games\n      -Diablo"));
    System.out.println(mytodo);

    System.out.println("---------------------------");

    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

   /* StringBuilder stringBuilder1 = new StringBuilder(reversed);
    stringBuilder1.reverse();
    System.out.println(stringBuilder1);*/






  }
}
