package JavaCoding.JavaCodingQuestion.ArrayCode;

public class MixArrayWithIntCharAndSpecialCharacter {
    public static void main(String[] args) {
        //String[] a = {"10", "a", "&", "20", "b", "10"};//output=40
//        String str="ab1e3457asd";//sum=20, count digit=5
//        int count=0;
//        String a[]=str.split("");
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            try {
//                sum = sum + Integer.parseInt(a[i]);
//                count++;
//            } catch (Exception e) {//java.lang.NumberFormatException: For input string: "a" and all char
//                System.out.println(e.getMessage());
//            }
//        }
//        System.out.println("Sum of only numbers:"+sum);
//        System.out.println("count the only numbers:"+count);

        //find the numberber of white spaces, lettes, sum of letters, digits
        String s = " !1! Hello 23 World @ *45";
        int digits = 0, letters = 0, whitespaces = 0, special = 0, sumOfDigits = 0;
        // char[] c=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sumOfDigits = sumOfDigits + Integer.parseInt(String.valueOf(c));
                digits++;
            } else if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isWhitespace(c)) {
                whitespaces++;
            } else {
                special++;
            }
        }
        System.out.println("Count no of digits :" + digits);//5
        System.out.println("Count no of letters :" + letters);//10
        System.out.println("Count no of whitespaces :" + whitespaces);//6
        System.out.println("Count no of special :" + special);//4
        System.out.println("Sum  of digits :" + sumOfDigits);//15

        //=========================================================================================================
  /*  String s="v2i4s@#h&*^Al";// letter->6, num->2, specialChar-> 5
    int num=0;
    int letter=0;
    int specChar=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)<='9' && s.charAt(i)>='0'){
            num++;
        } else if (s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z') {
            letter++;
        }else {
            specChar++;
        }
    }
        System.out.println("Letter :"+letter);
        System.out.println("Number :"+num);
        System.out.println("Special Character :"+specChar);

   */
    }
}