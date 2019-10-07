import java.util.HashMap;

public class MapIntro2 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("978-1-60309-452-8", "A Letter to Jo");
    map.put("978-1-60309-459-7", "Lupus");
    map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    map.put("978-1-60309-461-0", "The Lab");
    for (String key : map.keySet()) {
      System.out.println(map.get(key) + " (ISBN: " + key + ")");
    }
    map.remove("978-1-60309-444-3");
    map.values().remove("The Lab");
    map.put("978-1-60309-450-4", "They Called Us Enemy");
    map.put("978-1-60309-453-5", "Why Did We Trust Him?");
    for (String key : map.keySet()) {
      System.out.println(map.get(key));
    }

    if (map.containsKey("478-0-61159-424-8")) {
      System.out.println("it has x");

    } else {
      System.out.println("nope");
    }

    System.out.println(map.get("978-1-60309-453-5"));
  }
}