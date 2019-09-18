import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Avocado");
        fruits.add("Blueberries");
        fruits.add("Durian");
        fruits.add("Lychee");
        ArrayList<String> fruits2list = new ArrayList<>();
        for (String fruit : fruits.toArray(new String[0])) {
            fruits2list.add(fruit);

            System.out.println(fruits.contains("Durian"));

        }
    }
}
