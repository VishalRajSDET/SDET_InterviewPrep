package JavaCoding.JavaCodingQuestion.StringCode.FirstRepeatedChar;

import java.util.HashMap;

public class FirstRepeatedCharWithHashmap {

    public static char getFirstRepeatedChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                return c; // return the first repeated character
            }
            map.put(c, 1); // mark the character as encountered
        }
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println("get First Repeated Char :" + getFirstRepeatedChar("geeksforgeeks"));//output--> e
        System.out.println("get First Repeated Char :" + getFirstRepeatedChar("VishalRaj"));//output--> a

    }
}
