package CollectionConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapAllPossibleWayToIterate {
    public static void main(String[] args) {
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.put(4, 'c');
        map.put(5, 'd');
        //Iteration by using keySet()
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            char value = map.get(key);
            System.out.println("Key =" + key + " value =" + value);
        }
        System.out.println("=====================================================================");
/*
he next() method is used to fetch each element from the collection during iteration. --> Throws NoSuchElementException if no next element is available.  -->The next element
hasNext() is used to check if there is a next element before calling next(). -->Does not throw any exception.--> boolean (true/false)
 */

        //iterator: over the set (pair) by using enterySet()
        Iterator<Map.Entry<Integer, Character>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<Integer, Character> entry=entryIterator.next();
            System.out.println("key ="+entry.getKey()+" value ="+entry.getValue());
        }
    }
}
