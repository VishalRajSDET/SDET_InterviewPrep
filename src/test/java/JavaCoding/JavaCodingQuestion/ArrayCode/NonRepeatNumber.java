package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NonRepeatNumber {
    public static void main(String[] args) {
        int[] a = {1, 9, 2, 3, 9, 8, 1, 2, 3, 4};// output-> Non repeat[8,4]
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        ArrayList<Integer> DupList = new ArrayList<>();
        ArrayList<Integer> nonDupList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                nonDupList.add(entry.getKey());
            }else {
                DupList.add(entry.getKey());
            }
        }
        System.out.println("duplicate elements :"+DupList);
        System.out.println("Non duplicate elements :"+nonDupList);
    }
}
