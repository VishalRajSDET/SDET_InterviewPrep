package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CodeTest {
    public static void main(String[] args){
        String str="abc, 12 Tumas";//sam, 12 uTcba
        int left=0;
        int right=str.length()-1;
        char[] reverseString=new char[str.length()];
        while (left<=right){
            if(!Character.isLetter(str.charAt(left))){
                reverseString[left]=str.charAt(left);
                left++;
            }else if (!Character.isLetter(str.charAt(right))){
                reverseString[right]=str.charAt(right);
                right--;
            }else {
                reverseString[left]=str.charAt(right);
                reverseString[right]=str.charAt(left);
                left++;
                right--;
            }
        }
        System.out.println(new String(reverseString));
    }
}
