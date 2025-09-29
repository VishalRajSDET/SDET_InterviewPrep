package JavaCoding.DSA.SlidingWindowProblems;

/**
 * 📌 Problem Statement (LeetCode 1456)
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of length k.
 */
public class MaximumVowelsInSubstringOfSizeK {

    public static int maxVowelsSubstring(String s, int k) {
        String vowels = "aeiou";
        int winVowel = 0;
        int startIndex = 0; // best substring start index
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                winVowel++;
            }
        }
        int maxVowels = winVowel;
        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i - k)) != -1) { // remove left char
                winVowel--;
            }
            if (vowels.indexOf(s.charAt(i)) != -1) {
                winVowel++;
            }
            // maxVowels=Math.max(winVowel,maxVowels);// if you want print only max count of vowel in substring
            //below logic I am writing to print max vowel substring also
            if (winVowel > maxVowels) {
                maxVowels = winVowel;
                startIndex=i-k+1; // update best start
            }
        }
        System.out.println("Substring = "+s.substring(startIndex,startIndex+k));
        return maxVowels;
    }

    public static void main(String[] args) {
        String s = "iiidef";
        int k = 3;
        System.out.println(maxVowelsSubstring(s, k));
    }
}
