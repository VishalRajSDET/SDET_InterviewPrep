package CollectionConcepts;

import java.util.HashMap;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("V",1);
        hm.put("w",5);
        hm.put("x",2);
        Iterator<String> iterator= hm.keySet().iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            System.out.println("Key "+key +": Value "+ hm.get(key));
        }
    }
}
