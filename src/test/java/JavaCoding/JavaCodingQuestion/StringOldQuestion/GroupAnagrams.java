package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
       // String[] str={"listen", "silent", "hello", "world", "evil", "vile", "cat", "tac", "race", "care"};
//         * Output: listen silent hello world evil vile cat tac race care"
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"}; // output-> ["bat"],["nat","tan"],["ate","eat","tea"]
        LinkedHashMap<String, List<String>> anagrams=new LinkedHashMap<>();
        for (String s : str){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(s);
        }
        System.out.println(new ArrayList<>(anagrams.values()));//[[eat, tea, ate], [bat], [tan, nat]]
        System.out.println(anagrams.values());//[[eat, tea, ate], [bat], [tan, nat]]
    }
}
