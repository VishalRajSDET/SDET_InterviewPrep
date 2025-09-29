package JavaCoding.DSA;

public class LongestPalindromicSubstring {
    /**
     *  this video will help : https://youtu.be/AKIHWGumagI?si=T18RMRF9CxbDV6rc
     * @param str
     * @return
     */
    public static String getLongestPalindrome(String str) {
        if (str == null || str.length() < 1) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = expandFromCenter(str, i, i); // Odd-length palindrome
            int len2 = expandFromCenter(str, i, i + 1); // Even-length palindrome
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2; // Calculate new start index
                end = i + len / 2; // Calculate new end index
            }
        }
        return str.substring(start, end + 1);
    }

    public static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(getLongestPalindrome("abaa"));
    }
}
