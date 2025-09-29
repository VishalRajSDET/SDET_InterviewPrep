package CollectionConcepts;

import java.util.*;

public class SortMapByKeyOrValue {
//Note -> Map.Entry allows you to access both the key and value of an entry in a map.
    public static void main(String[] args){
        // Create a HashMap with Integer keys and Character values
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'z');
        map.put(3, 'c');
        map.put(4, 'x');
        map.put(5, 'd');
        System.out.println("Before sort map:"+ map);

        // Convert the map to a list of entries
        List<Map.Entry<Integer,Character>> entryList=new ArrayList<>(map.entrySet());

        // Sort the list by value (alphabetically since values oi form of alphabetically)
       // entryList.sort(Map.Entry.comparingByValue());//sort by value in ascending order
      //  entryList.sort(Map.Entry.comparingByKey());// sort by key in ascending order
        //entryList.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));//reverse by key in descending order
        //entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));//reverse by key in descending order
        Collections.sort(entryList,Map.Entry.comparingByValue(Comparator.reverseOrder()));//reverse by key in descending order
        // Convert the sorted list back into a LinkedHashMap to maintain the order
        LinkedHashMap<Integer,Character> linkedHashMap=new LinkedHashMap<>();
        for(Map.Entry<Integer,Character> entry: entryList){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println("Map after sorting by value :"+linkedHashMap);
    }
}
