package CollectionConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveValueFromHashMap {
    public static void main(String[] args){
        //remove c from the map
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.put(4, 'c');
        map.put(5, 'd');
        System.out.println("Before removal: " + map);
        Iterator<Map.Entry<Integer,Character>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Character> entry=iterator.next();
            if(entry.getValue()=='c'){
                iterator.remove();
            }
        }
        System.out.println("Map after remove c "+ map);
    }
}
