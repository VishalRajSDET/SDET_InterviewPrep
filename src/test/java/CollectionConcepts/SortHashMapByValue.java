package CollectionConcepts;

import com.google.errorprone.annotations.Var;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("A",7);
        hm.put("D",3);
        hm.put("F",3);
        hm.put("E",5);
        hm.put("C",1);
        hm.put("B",8);
       Map<String,Integer>sortedMap= hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
       sortedMap.forEach((key,value)->System.out.print(key +"->"+ value+" "));//C->1 D->3 F->3 E->5 A->7 B->8
       System.out.println(sortedMap);//{C=1, D=3, F=3, E=5, A=7, B=8}
        //But in case of sort by value then at line no 19 in place of comparingByValue() we will replace with comparingByKey()

    }
}
