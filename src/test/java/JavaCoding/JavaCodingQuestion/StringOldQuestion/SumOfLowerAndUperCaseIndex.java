package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.Scanner;

public class SumOfLowerAndUperCaseIndex {
    public static void main(String[] args) {
       // String str="VishalRAJ";//lowercase=15,upperCaseSum=21
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Name:");
        String str=sc.nextLine();
        int lowerCaseSum=0;
        int upperCaseSum=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                lowerCaseSum=lowerCaseSum+i;
            }
            else {
                upperCaseSum=upperCaseSum+i;
            }
        }
        System.out.println("Sum of lowercase index:"+lowerCaseSum);
        System.out.println("Sum of upperCaseSum index:"+upperCaseSum);
    }
}
