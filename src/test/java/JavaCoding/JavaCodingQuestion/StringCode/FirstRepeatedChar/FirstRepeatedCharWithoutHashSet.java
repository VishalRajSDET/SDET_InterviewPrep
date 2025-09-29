package JavaCoding.JavaCodingQuestion.StringCode.FirstRepeatedChar;

public class FirstRepeatedCharWithoutHashSet {

    public static char getFirstRepeatedChar(String str) {
        /** 2. Why the Size is 256?
         The size 256 is chosen specifically to cover the entire Extended ASCII character set.
         The standard ASCII set contains 128 characters (values 0-127), which includes all standard English letters (upper and lower case), numbers, and common symbols.
         The Extended ASCII set uses a full byte (8 bits) to represent 256 characters (values 0-255).
         By making the array size 256, we create a slot for every possible character in this common set. It's a safe and efficient choice for most string problems

         Time Complexity: O(n), where n is the number of characters in the string. We only need to loop through the string once.
         */
        boolean[] booleans = new boolean[256];
        for (char c : str.toCharArray()) {
            if (booleans[c] == true) { // Found the repeat. Return it.
                return c;
            }
            booleans[c] = true; // // Mark this character as seen.
        }
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println("get First Repeated Char :" + getFirstRepeatedChar("geeksforgeeks"));//output--> e
        System.out.println("get First Repeated Char :" + getFirstRepeatedChar("VishalRaj"));//output--> a
        System.out.println("get First Repeated Char :" + getFirstRepeatedChar("google"));//output--> o
        System.out.println("get First Repeated Char :" + getFirstRepeatedChar("121abcde"));//output--> 1
        System.out.println("get First Repeated Char :" + getFirstRepeatedChar("@@121abcde"));//output--> a

    }

    /**
     Each slot is a 'null' reference (an empty box)
     Boolean[] objectArray = new Boolean[3]; // [null, null, null]

     Each slot is a real 'false' value from the start
     boolean[] primitiveArray = new boolean[3]; // [false, false, false]
     */

}
