package JavaCoding.JavaCodingQuestion.StringOldQuestion;


import java.util.Arrays;
import java.util.Comparator;

public class LongestAndSmallestString {
    public static void main(String[] args) {
        //Youtube: https://youtu.be/8QhMDdGal5k?si=8IgqgCPb9YnRjjQF
       /* String str = "My Name is Vishal Raj";
        //1st approach by using loop
        String[] arr = str.split(" ");
        String longest = arr[0];//we can take anything like arr[0] or arr[2] anything like that
        String smallest = arr[3];//we can take anything like arr[0] or arr[2] anything like that
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            }
            if (arr[i].length() < smallest.length()) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest String :" + longest);//Vishal
        System.out.println("Smallest String :" + smallest);//My --> why "My" is smallest "is" is also have same length because "My" occur 1st
        //===================================================================================================================================
        //2nd approach using
        String longest1 = Arrays.stream(arr).max(Comparator.comparing(String::length)).get();
        String longest2 = Arrays.stream(arr).reduce((x, y) -> x.length() > y.length() ? x : y).get();

        String smallest1 = Arrays.stream(arr).min(Comparator.comparing(String::length)).get();
        String smallest2 = Arrays.stream(arr).reduce((x, y) -> x.length() < y.length() ? x : y).get();
        System.out.println("largest1 :" + longest1);//Vishal
        System.out.println("largest2 :" + longest2);//Vishal
        System.out.println("smallest1 :" + smallest1);//My
        System.out.println("smallest2 :" + smallest2);//is
*/
        //=================================================================================================================================
        System.out.println("Find the 2nd largest String from array or from String");
        //Find the 2nd largest String from array or from String
        String[] name = {"Vishal", "Aman", "Vivek", "Lavkush"};
        String longName = name[0];
        String secondLongName = name[0];
        for (int i = 0; i < name.length; i++) {
            if (name[i].length() > longName.length()) {
                secondLongName = longName;
                longName = name[i];
            } else if (name[i].length() > secondLongName.length()) {
                secondLongName = name[i];
            }
        }
        System.out.println("Longest Name :" + longName);//Lavkush
        System.out.println("2ndLongest Name :" + secondLongName);//Vishal

        //Note Same approach we can do for 2nd smallest String

    }
}
