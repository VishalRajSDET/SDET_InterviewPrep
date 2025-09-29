package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringCodeUsingStreamAPICode {
    public static void main(String[] args) {
        String[] str = {"Vishal", "Lavkush", "Aman", "Shiva"};
        //Find Maximum length String from array
        //Youtube: https://youtu.be/xST29NfGUoQ?si=DJWSztOJz-CZHnuH
        //Approach 1st by using max method
        String longestName1 = Arrays.stream(str).max(Comparator.comparing(String::length)).get();
        System.out.println("Longest Name :" + longestName1);//Lavkush
        //Approach 2nd using reduce()
        String longestName2 = Arrays.stream(str).reduce((x, y) -> x.length() > y.length() ? x : y).get();
        System.out.println("Longest Name :" + longestName2);//Lavkush
        //==============================================================================================
        String smallestElement1=Arrays.stream(str).min(Comparator.comparing(String::length)).get();
        //or
        String smallestElement2= Arrays.stream(str).reduce((x,y)->x.length()<y.length()? x:y).get();//here x : y --> x is smallest string because x.length()<y.length(), If we do y:x then x become maximum
        System.out.println("Smallest Name :" + smallestElement1);
        System.out.println("Smallest Name :" + smallestElement2);
    }
}
