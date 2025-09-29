package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class longestSubString {
    public static void main(String[] args) {
  String str = " ";
        String longestSubString = "";
        int longestSubStringLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0; // Start index of the current substring window

        for (int i = 0; i < str.length(); i++) {
            // If the character is already in the current window, move the start position
            if (map.containsKey(str.charAt(i))) {
                // Move start to the position after the last occurrence of the character
                start = Math.max(start, map.get(str.charAt(i)) + 1);
            }
            // Put the current character and its index in the map
            map.put(str.charAt(i), i);

            // Update the longest substring if the current window is larger
            if (i - start + 1 > longestSubStringLength) {
                longestSubStringLength = i - start + 1;
                longestSubString = str.substring(start, i + 1);
            }
        }

        System.out.println("Longest Substring: " + longestSubString);
        System.out.println("Longest Substring Length: " + longestSubStringLength);
    }
}
