package JavaCoding.JavaCodingQuestion.StringCode.FirstNonRepeatingChar;

import java.util.HashMap;

public class FindFirstNonRepeatingCharWithHashMap {

    public static char getFirstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
//        for (int i=str.length()-1;i>=0;i--) {
//            char c=str.charAt(i);// Note: if last non repeat char then we have to move from last
//            if (map.get(c) == 1) {
//                return c;
//            }
//        }
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println("First Non-Repeating Character: " + getFirstNonRepeatingChar("geeksforgeeks"));  // Output: 'f'
        System.out.println("First Non-Repeating Character: " + getFirstNonRepeatingChar("aabbccdd"));      // Output: '\0' (No non-repeating character)
        System.out.println("First Non-Repeating Character: " + getFirstNonRepeatingChar("VishalRaj"));     // Output: 'V'
    }
}
