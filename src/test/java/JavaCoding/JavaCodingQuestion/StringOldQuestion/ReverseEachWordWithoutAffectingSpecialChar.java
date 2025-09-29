package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseEachWordWithoutAffectingSpecialChar {
    public static void main(String[] args) {
        String s = "This is, the most; particular example!";

        // Extract all words
        String[] words = s.split("[^A-Za-z]+");
        // Reverse them
        for (int i = 0, j = words.length - 1; i < j; i++, j--) {
            String tmp = words[i];
            words[i] = words[j];
            words[j] = tmp;
        }

        // Rebuild using regex to replace each word with the next from reversed list
        Matcher m = Pattern.compile("[A-Za-z]+").matcher(s);
        StringBuffer sb = new StringBuffer();
        int idx = 0;
        while (m.find()) {
            m.appendReplacement(sb, words[idx++]);
        }
        m.appendTail(sb);

        System.out.println(sb.toString());
    }
}
