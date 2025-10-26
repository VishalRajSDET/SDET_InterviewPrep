package JavaCoding.DSA;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class GroupAnagramsWithoutSorting {

    public static List<List<String>> getAllAnagrams(String[] str){
        LinkedHashMap<String,List<String>> anagrams= new LinkedHashMap<>();
        for (String s : str) {
            int[] frequency = new int[26];// frequency array for 'a' to 'z'
            // Count character frequency
            for (char c : s.toLowerCase().toCharArray()) {
                frequency[c - 'a'] = frequency[c - 'a'] + 1;
            }

            StringBuilder keyBuilder=new StringBuilder();
            for(int f: frequency){
                keyBuilder.append(f).append("#"); // separator avoids collisions
            }
            String key=keyBuilder.toString();// Here I am making key
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("group anagrams for input1 is :"+ getAllAnagrams(input1));

        String[] input2 = {"listen", "silent", "enlist", "google", "gooegl", "cat", "tac", "act"};
        System.out.println("group anagrams for input2 is :"+ getAllAnagrams(input2));

        String[] input3 = {"a", "b", "c", "a", "c"};
        System.out.println("group anagrams for input3 is :"+ getAllAnagrams(input3));

        String[] input4 = {"", "", "a"};
        System.out.println("group anagrams for input4 is :"+ getAllAnagrams(input4));

        String[] input5 = {"Eat", "Tea", "ATE", "Bat", "tab"};
        System.out.println("group anagrams for input5 is :"+ getAllAnagrams(input5));

        String[] input6 = {"aabb", "baba", "bbaa", "abab", "aaab", "abaa"};
        System.out.println("group anagrams for input6 is :"+ getAllAnagrams(input6));

    }
}
