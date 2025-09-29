package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.ArrayList;

public class StringDeCompression {
    public static void main(String[] args) {

        String input="ra3b2a1c2b2";  //-->output->raaabbaccbb
        String output="";
        for (int i=0;i<input.length();i++){
            if (Character.isLetter(input.charAt(i))){
                output=output+input.charAt(i);
            }else if(Character.isDigit(input.charAt(i))){
                int numeric=Character.getNumericValue(input.charAt(i));//to get numeric value in the int form
                char letter=input.charAt(i-1);
                for (int j=1;j<numeric;j++){// loop is for numeric value ex. a3 a is 3 times
                    output=output+letter;

                }
            }
        }
        System.out.println(output);//aaabbaccbb
    }
}



