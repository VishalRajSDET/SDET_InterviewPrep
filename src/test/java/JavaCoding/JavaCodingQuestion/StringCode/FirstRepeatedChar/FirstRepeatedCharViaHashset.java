package JavaCoding.JavaCodingQuestion.StringCode.FirstRepeatedChar;

import java.util.HashSet;

public class FirstRepeatedCharViaHashset {
    /**
     * Overall Time Complexity:
     * Best Case:
     * If the first repeated character is found early in the string, the algorithm might return early. However, in terms of time complexity,
     * we still consider it O(n) because we may need to examine all characters until a repeat is found.
     *
     * Worst Case:
     * In the worst case, we will need to traverse the entire string and add each character to the HashSet before finding a repeated character
     * or determining there is none. So the time complexity in the worst case is still O(n).
     * @param str
     * @return
     */

    public static char getFirstRepeatedChar(String str){
        HashSet<Character> set=new HashSet<>();
        for(char c: str.toCharArray()){
            if(set.contains(c)){
                return c;
            }
            set.add(c);
        }
        return '\0';
    }

    public static void main(String[] args){
        System.out.println("get First Repeated Char :"+ getFirstRepeatedChar("geeksforgeeks"));//output--> e
        System.out.println("get First Repeated Char :"+ getFirstRepeatedChar("VishalRaj"));//output--> a

    }
}
