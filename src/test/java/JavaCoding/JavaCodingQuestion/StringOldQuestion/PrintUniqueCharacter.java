package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.Scanner;

public class PrintUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the input :");
        String input=sc.nextLine();
        // Assume ASCII characters (0-127), use boolean array to track character occurrences
        boolean[] unique=new boolean[128];
        for (int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(!unique[c]){
                unique[c]=true;
                System.out.print(c+" ");
            }
        }
    }
}
