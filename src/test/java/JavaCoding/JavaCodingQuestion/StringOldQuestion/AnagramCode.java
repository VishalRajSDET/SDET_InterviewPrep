package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class AnagramCode {
    public static void main(String[] args) {
//        String s1="Java";
//        String s2="aJva";
//        char[] c1= s1.toCharArray();
//        char[] c2= s2.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        if(Arrays.equals(c1,c2)){
//            System.out.println("String are anagrams..");
//        }else {
//            System.out.println("String are not anagrams..");
//        }
        //Another appraoch
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        String s1 = "Java";
        String s2 = "aJva";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            //int count = charCountMap.getOrDefault(c, 0);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (charCountMap.containsKey(c)) {
                count++;
            }
        }
        if (s2.length() == count) {
            System.out.println("String are anagrams..");
        } else {
            System.out.println("String are not anagrams..");
        }
        // System.out.println(charCountMap);
//        Iterator<Character> iterator=charCountMap.keySet().iterator();
//      while (iterator.hasNext()){
//          char cKey=iterator.next();
//          System.out.println(cKey+":"+charCountMap.get(cKey));
//      }
    }
}
