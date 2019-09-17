import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println(map.isEmpty());
        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");

        System.out.println(map.keySet());
        System.out.println("-----------------------");
        System.out.println(map.values());

        System.out.println("-----------------------");
        map.put(68, "D");

        System.out.println("-----------------------");
        for (Map.Entry<Integer, String> obj : map.entrySet()) {
            System.out.print(" " + obj.getValue());
            System.out.print(" " + obj.getKey());


        }

        System.out.println();
        System.out.println("-----------------------");
        System.out.println((map.get(99)));
        System.out.println("-----------------------");
        map.remove(97);

        System.out.println(map.containsKey(100));
        System.out.println("-----------------------");
        map.clear();
    }

}
