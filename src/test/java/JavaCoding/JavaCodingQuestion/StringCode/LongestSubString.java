package JavaCoding.JavaCodingQuestion.StringCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int left = 0;
        String longestString = "";
        Map<Character, Integer> hm = new LinkedHashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (hm.containsKey(c)) {
                hm.remove(c, left);
                left++;
            }
            hm.put(c, right);
            if (hm.size() > longestString.length()) {
                StringBuilder sb = new StringBuilder();
                for (char c1 : hm.keySet()) {
                    sb.append(c1);
                }
                longestString = sb.toString();
            }
        }
        System.out.println("longest substring :" + longestString);
        /**
         Time Complexity: O(n)
         Space Complexity: O(min(n, charset size))
         */
    }
}
/**
 * Time Complexity
 * Each character in the string is processed at most twice:
 * Once when the right pointer adds it to the map.
 * Once when the left pointer removes it from the map in the while loop.
 * So the total operations are proportional to 2n, which is O(n).
 * Even though there’s a nested while loop, it does not make it O(n²) because each character is removed only once over the whole run.
 */


