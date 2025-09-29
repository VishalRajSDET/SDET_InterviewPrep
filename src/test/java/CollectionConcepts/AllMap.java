package CollectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMap {
    public static void main(String[] args) {


        /**
         * Map--> Map is an interface; support for null keys/values and insertion order depends on the implementing class HashMap.
         * HashMap--> allows one null key and multiple null values. It does not maintain insertion order.
         * LinkedHashMap--> allows key as null and values can be also null and it maintains insertion order.
         * TreeMap--> does not allow null keys (unless a custom Comparator is provided that can handle null) but allows multiple null values.
         * By default, it maintains keys in ascending natural order.
         */
        System.out.println("---------------Map------------");
        Map<String, Integer> m = new HashMap<>();
        m.put("C1", 1);
        m.put("A1", 2);
        m.put("B1", 3);
        for (String key : m.keySet()) {
            System.out.println(key + ":" + m.get(key));
        }
        System.out.println("---------------HashMap------------");

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("C2", 1);
        hm.put("A2", 2);
        hm.put("B2", 3);
        for (String key : hm.keySet()) {
            System.out.println(key + ":" + hm.get(key));
        }
        System.out.println("---------------LinkedHashMap------------");

        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
        lm.put("C3", 1);
        lm.put("A3", 2);
        lm.put("B3", 3);
        for (String key : lm.keySet()) {
            System.out.println(key + ":" + lm.get(key));
        }
        System.out.println("---------------TreeMap------------");

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("C4", 1);
        tm.put("A4", 2);
        tm.put("B4", 3);
        tm.put("B5", null);
        for (String key : tm.keySet()) {
            System.out.println(key + ":" + tm.get(key));
        }
    }
}
