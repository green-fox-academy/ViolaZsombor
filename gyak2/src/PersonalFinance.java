import java.util.ArrayList;

public class PersonalFinance {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(500);
    list.add(1000);
    list.add(1250);
    list.add(175);
    list.add(800);
    list.add(120);

    System.out.println("List of our spendings: " + list);
    System.out.println("Sum of the spending: " + sumTheSpents(list));
    System.out.println("Maximum amount of one spending: " + maxspending(list));
    System.out.println("Cheapest spending: " + cheapestspend(list));
    System.out.println("Average spending: " + averageSpending(list));

  }

  public static int sumTheSpents(ArrayList arrayList) {
    int temp = 0;
    for (int i = 0; i < arrayList.size(); i++) {
      temp += (int) arrayList.get(i);
    }
    return temp;
  }

  public static int maxspending(ArrayList list) {
    int max = 0;
    for (int i = 0; i < list.size(); i++) {
      if ((int) list.get(i) > (int) list.get(max)) {
        max = i;
      }
    }
    return (int) list.get(max);
  }

  public static int cheapestspend(ArrayList list) {
    int min = 0;
    for (int i = 0; i < list.size(); i++) {
      if ((int) list.get(i) < (int) list.get(min)) {
        min = i;
      }
    }
    return (int) list.get(min);
  }

  public static int averageSpending(ArrayList arrayList) {
    int temp = 0;
    for (int i = 0; i < arrayList.size(); i++) {
      temp += (int) arrayList.get(i);
    }
    return (temp / arrayList.size());


  }
}

