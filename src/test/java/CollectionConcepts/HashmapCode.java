package CollectionConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapCode {
    public static void main(String[] args) {
        /**
         *   Basic concept of HashMap
         */
      /*  HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Math",90);
        hm.put("English",93);
        hm.put("Hindi",99);
        hm.put("Physics",78);
        System.out.println("get key only :"+hm.keySet());
        System.out.println("get value only :"+hm.values());
        for(HashMap.Entry<String,Integer> entry : hm.entrySet())//In summary, Map.Entry<String, Integer> allows you
            // to work directly with key-value pairs stored within
            // a Map collection, providing methods to retrieve and manipulate both
            // the key and the value of each entry.
        {
            String getKey=entry.getKey();
            Integer getValue=entry.getValue();
            System.out.println(getKey+"-->"+getValue);

        }

        /**
         *   Program--> Sort the HashMap key and values
         *   Approach 1: Using TreeMap for Sorting
         * If you need to maintain the keys in a sorted order, you can use a TreeMap, which is a sorted implementation
         * of the Map interface. Here’s how you can sort keys of a HashMap using a TreeMap:
         */

        HashMap<String,Integer> hM=new HashMap<>();
        hM.put("D",6);
        hM.put("A",10);
        hM.put("O",4);
        hM.put("K",1);
        TreeMap<String,Integer> tm=new TreeMap<>(hM);
        for (String key: tm.keySet()){
            System.out.println(key +"--> "+tm.get(key));
        }
        for (HashMap.Entry<String,Integer> entry: hM.entrySet()){
            System.out.println("Key :"+entry.getKey() +"  Value:"+entry.getValue());
        }

//        String s = "vishala";
//        char[] a = s.toCharArray();
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 'a' || a[i] == 'i') {
//                if (map.containsKey(a[i])) {
//                    map.put(a[i], map.get(a[i]) + 1);
//                } else {
//                    map.put(a[i], 1);
//                }
//            }
//        }
//        for (char key : map.keySet()) {
//            System.out.println(key + ":" + map.get(key));
//
//        }
    }
}
