package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.HashSet;

public class PangramCode {

    /**
     * A pangram is a sentence that uses every letter of the alphabet at least once.
     */
    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        if (s.length() < 26) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        if (set.size() == 26) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over a lazy dog"));//true
        System.out.println(isPangram("The quick brown fox jumps over a"));//false
        System.out.println(isPangram("The quick brown fox jumps"));//false

    }
}
