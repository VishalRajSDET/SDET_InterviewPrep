package JavaCoding.JavaCodingQuestion.StringOldQuestion;


import java.util.Arrays;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String s = "V2i5aeous8aiiwei9h1a2";// Sum of digit 2+5+8+9+1+2=27;
//        char[] c=s.toCharArray();
//        int sum=0;
//        for(int i=0;i<c.length;i++){
//            if(c[i]>='0' && c[i]<='9'){
////                sum=sum+c[i]-'0';
//                //or
//                sum=sum+Integer.parseInt(String.valueOf(c[i]));
//            }
//        }
//       System.out.println(sum);

        int con = 0;
        int v = 0;
        String vowels = "AEIOUaeiouasaa";
        char[] c = s.toCharArray();
        int count = 1;
        HashMap<Character, Integer> hmVowel = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            if (vowels.contains(String.valueOf(c[i]))) {
                hmVowel.put(c[i], hmVowel.getOrDefault(c[i], 0) + 1);
                v++;
            } else {
                con++;
            }
        }
        System.out.println("Vewels :" + v);
        System.out.println("Consonant :" + con);
        System.out.println("Vewels with count :" + hmVowel.keySet());
        for (char c1 : hmVowel.keySet()) {
            if (c1 == 'a') {
                System.out.println(c1 + ":" + hmVowel.get(c1));
            }
        }
    }
}

