package CollectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
//Note:A Map doesn't allow duplicate keys, but you can have duplicate values.
// HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key but value can be null.
public class LinkedHashMapCode {
    public static void main(String[] args) {
        //LinkedHashMap<String,Integer>lm=new LinkedHashMap<>();
        TreeMap<String,Integer> lm=new TreeMap<>();
        lm.put("Vishal",1);
        lm.put("Lavkush",2);
        lm.put("Aman",3);
        lm.put(null,4);
       // TreeMap<String,Integer> tm=new TreeMap<>(lm);
        for (String key: lm.keySet()){
            System.out.println(key+":"+lm.get(key));
        }
    }
}
