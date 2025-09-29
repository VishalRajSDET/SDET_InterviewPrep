package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class StringCompression {
    public static void main(String[] args) {
        /*String str = "abbcddaacc";//output-> a1b2c1d2a2c2
        StringBuilder compressed = new StringBuilder();

        int count = 1;
        char lastChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == lastChar) {
                count++;
            } else {
                compressed.append(lastChar);
                compressed.append(count);
                lastChar = str.charAt(i);
                count = 1;
            }
        }
        // Append the last character sequence
        compressed.append(lastChar);
        compressed.append(count);

        System.out.println("Compressed string: " + compressed.toString());


        //Assume input string contains only alphabet symbols and digits. Write a program to sort characters of the String, First alphbet symbols followed by digits?
        //input= B4A1D3 then output=ABD134
//isDigit() to check digit
      /*  String str = "B4A1D3";
        String alpha = "";
        String digit = "";
        StringBuilder output=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                alpha = alpha + str.charAt(i);
            } else {
                digit = digit + str.charAt(i);
            }
        }
        char[] a =alpha.toCharArray();
        char[] d=digit.toCharArray();
        Arrays.sort(a);
        Arrays.sort(d);
        System.out.println(a);
        System.out.println(d);
        output.append(a).append(d);
        System.out.println(output);//BDa134 */
//=================================================================================================================================
        //Input =aaabbcddabc  output=a3b2c1d2a1b1c1

    /*    String str = "aaabbcddabc";
        int count = 1;
        char last = str.charAt(0);
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                output.append(last);
                output.append(count);
                count = 1;
                last = str.charAt(i);
            }if (i==str.length()-1){// this is for the last element
            output.append(last);
            output.append(count);
            }
        }
        System.out.println(output.toString());//a3b2c1d2a1b1c1*/

        //2nd approach by using String not using string builder
      /*  String str = "abbcddaacc";//output-> a1b2c1d2a2c2
        String output = "";
        int count = 1;
        char lastChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == lastChar) {
                count++;
            } else {
                output = output+lastChar + count;
                lastChar = str.charAt(i);
                count = 1;
            }
        }
        // Append the last character sequence
        output = output+lastChar + count;
        System.out.println("Compressed string: " + output);*/

        //  ======================================================================================================
        //input =a4k3b2 output=aeknbd
        /*
        char ch = 'A';
       int asciiValue = (int) ch;
      System.out.println("ASCII value of " + ch + " is: " + asciiValue); // Output: ASCII value of A is: 65

        int asciiValue = 65;
        char ch = (char) asciiValue;
        System.out.println("Character for ASCII value " + asciiValue + " is: " + ch); // Output: Character for ASCII value 65 is: A

         */

       String input="a4k3b2";
        int asciiValue=0;
        StringBuilder output= new StringBuilder();
        for (int i=0;i<input.length();i++){
            if(Character.isAlphabetic(input.charAt(i))){
                output.append(input.charAt(i));
                 asciiValue= (int) input.charAt(i);

            }else {
              asciiValue=asciiValue+Character.getNumericValue(input.charAt(i));//getNumericValue() method work like forex we have '4' then it will convert int 4
             char asciiToLetter=(char)asciiValue;
             output.append(asciiToLetter);
            }
        }
        System.out.println(output.toString());//aeknbd



//================================================================================================================
//another approach
        //input =a4k3b2 output=aeknbd
   /*     String s = "a4k3b2";
        int ascValue = 0;
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= '9') {
                int c = s.charAt(i) - '0' + ascValue;
                output = output + (char) c;
            } else {
                output = output + s.charAt(i);
                ascValue = (int) s.charAt(i);
            }
        }
        System.out.println(output);*/
    }
}

