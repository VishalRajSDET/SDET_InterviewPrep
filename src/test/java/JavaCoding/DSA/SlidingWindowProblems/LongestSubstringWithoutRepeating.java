package JavaCoding.DSA.SlidingWindowProblems;

import java.util.HashSet;

/**
 * 📌 Problem Statement
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 * 👉 Example:
 * s = "abcabcbb" → Answer = 3 ("abc").
 */
public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        int start = 0; // to track starting index of longest substring
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            //   maxLen=Math.max(maxLen,right-left+1);
            // Update max length and starting index if new max found
            int curMax = right - left + 1;
            if (curMax > maxLen) {
                maxLen = curMax;
                start = left;
            }
        }
        System.out.println("Longest Substring = " + s.substring(start, start + maxLen) + " ");
        return maxLen;
    }

    public static void main(String[] args) {
//        String s = "abcabcbb";//abc
//        String s = "abcabcbbzxcds";//bzxcds
        String s = "abcb";
        System.out.println("Length of Longest Substring  "+lengthOfLongestSubstring(s));
    }
    /**
     * 🕒 Complexity
     * Time: O(n) → each character is added and removed at most once.
     * Space: O(min(n, charset)) → in worst case O(n) for storing characters.
     */

    /**
     * Context
     *
     * We’re finding the length of the current window (substring) between two pointers:
     * left → start index of window
     * right → end index of window
     * So, the window length = number of characters between left and right (inclusive).
     * 🔹 Why +1?
     * If we only do right - left, we’re not counting the last character.
     * Example:
     * s = "abcabcbb"
     * Suppose left = 0 and right = 2 → substring = "abc"
     * 👉 Length = 2 - 0 = 2 (WRONG ❌, it ignores index 2)
     * 👉 Correct length = 2 - 0 + 1 = 3 ✅
     */
}
