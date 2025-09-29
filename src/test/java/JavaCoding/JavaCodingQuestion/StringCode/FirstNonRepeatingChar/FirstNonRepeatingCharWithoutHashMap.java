package JavaCoding.JavaCodingQuestion.StringCode.FirstNonRepeatingChar;

public class FirstNonRepeatingCharWithoutHashMap {

    public static char getFirstNonRepeatingChar(String str) {
        int[] counts = new int[256];
        // First pass: count characters
        for (int i = 0; i < str.length(); i++) {
            counts[str.charAt(i)]++;
        }

        // Second pass: find the first character with count 1
        for (int i = 0; i < str.length(); i++) {
            if (counts[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println("First non-repeating character: " + getFirstNonRepeatingChar("swiss"));//output : w
        System.out.println("First Non-Repeating Character: " + getFirstNonRepeatingChar("aabbccdd"));      // Output: '\0' (No non-repeating character)
        System.out.println("First Non-Repeating Character: " + getFirstNonRepeatingChar("VishalRaj"));     // Output: 'V'
    }
}
