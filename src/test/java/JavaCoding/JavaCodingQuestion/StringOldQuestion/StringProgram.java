package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class StringProgram {
    public static void main(String[] agrs) {
/**
 * Remove Vowels from a String
 */
        String str = "Vishal RAj";

        for (int i = 0; i < str.length(); i++) {
           /* if (str.charAt(i) == 'A' && str.charAt(i) == 'E' && str.charAt(i) == 'I' && str.charAt(i) == 'O' && str.charAt(i) == 'U' && str.charAt(i) == 'a' && str.charAt(i) == 'e' && str.charAt(i) == 'i' && str.charAt(i) == 'o' && str.charAt(i) == 'u') {
            } else {
                System.out.print(str.charAt(i));
            }*/
/**
 * Remove Consonants from a String
 */
        if (str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U' && str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
           System.out.print(str.charAt(i));//output: Vshl Rj
        }
            str.replaceAll(Character.toString(str.charAt(i)),"");
        }
    }
}

