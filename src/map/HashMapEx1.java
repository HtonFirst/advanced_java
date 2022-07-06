package map;

import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "John Wood");
        map1.put(3420, "Jack Preacher");
        map1.put(982, "Helen Hurricane");
        map1.put(7943, "Nataly Portman");
        map1.put(null, "Sidney Holms");
        map1.put(12343, null);
        map1.putIfAbsent(3420,"Kerry King");
        System.out.println(map1.get(1000));
        System.out.println(map1.get(1001));

        System.out.println(map1);
        map1.remove(12343);
        System.out.println(map1);

        System.out.println(map1.containsValue(null));
        System.out.println(map1.containsKey(null));

        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
