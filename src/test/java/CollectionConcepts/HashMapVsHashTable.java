package CollectionConcepts;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapVsHashTable {
    public static void main(String[] args) {
        //Hashtable -> does not allow null key and Does not guarantee any specific order for its entries.
        Hashtable<String,Integer> ht=new Hashtable<>();
        ht.put("Vishal",0);
        ht.put("Aman",8);
        ht.put("Shiva",5);
       // ht.put(null,8);//Cannot invoke "Object.hashCode()" because "key" is null
        for (Map.Entry<String,Integer> m:ht.entrySet() ){
            System.out.println(m.getKey()+":"+m.getValue());
        }
        System.out.println("-------------------------------------------");

        //HashMap--> allows null key and does not guarantee any specific order its entries
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Vishal",0);
        hm.put("Aman",8);
        hm.put("Shiva",5);
        hm.put(null,8);
        for (Map.Entry<String,Integer> m: hm.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());        }
    }
}
