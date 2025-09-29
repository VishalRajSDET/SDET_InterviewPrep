package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.Arrays;

public class ReverseStringWithoutAffectingSpecialCharacterAndNumber {
    public static void main(String[] args) {
       String str="rajvishalcs20@gmail.com";//mocliamgscl20@ahsiv.jar
       // Input:  "This is, the most; particular example!"
      //  Output: "example particular, most the; is This!"
        int left=0;
        int right=str.length()-1;
        char[] reverseString=new char[str.length()];
        while (left<=right){
            if(!Character.isAlphabetic(str.charAt(left))){
                reverseString[left]=str.charAt(left);
                left++;
            }else if (!Character.isAlphabetic(str.charAt(right))){
                reverseString[right]=str.charAt(right);
                right--;
            } else {
                reverseString[left]=str.charAt(right);
                reverseString[right]=str.charAt(left);
                left++;
                right--;
            }
        }
        System.out.println("String before reverse :"+ str);
        System.out.println("String after reverse :"+ new String(reverseString));//new String(reverseString) means i converted character array in to String


        //reverse string without affecting special character
      /*  String str="rajvishalcs20@gmail.com";//mocliamg02scl@ahsiv.jar

        int left=0;
        int right=str.length()-1;
        char[] reverseString=new char[str.length()];
        while (left<=right){
            if(!(Character.isLetter(str.charAt(left)) || Character.isDigit(str.charAt(left)))){
                reverseString[left]=str.charAt(left);
                left++;
            }else if (!(Character.isLetter(str.charAt(right)) || Character.isDigit(str.charAt(right)))){
                reverseString[right]=str.charAt(right);
                right--;
            } else {
                reverseString[left]=str.charAt(right);
                reverseString[right]=str.charAt(left);
                left++;
                right--;
            }
        }
        System.out.println("String before reverse :"+ str);
        System.out.println("String after reverse :"+ new String(reverseString));//new String(reverseString) means i converted character array in to String
*/
//String before reverse :rajvishalcs20@gmail.com
//String after reverse :mocliamg02scl@ahsiv.jar

    }
}
