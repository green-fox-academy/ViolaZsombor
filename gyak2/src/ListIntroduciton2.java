import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Create a list ('List A') which contains the following values
    Apple, Avocado, Blueberries, Durian, Lychee
    Create a new list ('List B') with the values of List A
    Print out whether List A contains Durian or not
    Remove Durian from List B
    Add Kiwifruit to List A after the 4th element
    Compare the size of List A and List B
    Get the index of Avocado from List A
    Get the index of Durian from List B
    Add Passion Fruit and Pomelo to List B in a single statement
    Print out the 3rd element from List A*/

public class ListIntroduciton2 {

  public static void main(String[] args) {
   ArrayList<String> A =new ArrayList<>();
   A.add("Apple");
   A.add("Avocado");
   A.add("Blueberries");
   A.add("Durian");
   A.add("Lychee");

   ArrayList<String> B = new ArrayList<>();
    for (int i = 0; i <A.size() ; i++) {
      B.add(A.get(i));
    }

    if (A.contains("Durian")) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
    B.remove("Durian");

    //compare size
    if (A.size()>B.size()) {
      System.out.println("A is biiger");
    } else if ((B.size()>A.size())) {
    }else System.out.println("even");

    //Get the index of Avocado from List A

    System.out.println( A.indexOf("Apple"));
    System.out.println(B.indexOf("Lychee"));
    B.addAll(Arrays.asList("Pomelo","banana"));

    System.out.println(B);
    }



  }

