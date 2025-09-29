package JavaCoding.DSA;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLength {

    public static int longestSubStringLength(String str){
        int start=0; // left pointer for window
        Map<Character,Integer> map=new HashMap<>();
        int longestSubStringLength=0;
        if(str == null || str.length() == 0) return 0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            // If seen before, move 'start' to max of current start or last seen + 1
            if(map.containsKey(c)){
                /**
                 * Interview tip:
                 * If asked “why +1?”, you can explain:
                 *
                 * “Because we want to exclude the previous duplicate character from the current substring window,
                 * so the new window starts right after the last occurrence of the repeated character.”
                 */
                start=Math.max(start,map.get(c)+1);
            }
            map.put(c,i); // Update index of current character
            longestSubStringLength=Math.max(longestSubStringLength,i-start+1);   // Window size = i - start + 1
        }

        return longestSubStringLength;
    }

    public static void main(String[] args) {
        System.out.println("Longest Substring Length: " + longestSubStringLength("ascvb"));
    }
}
