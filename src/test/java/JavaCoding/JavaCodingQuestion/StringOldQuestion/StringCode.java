//Note: To convert Integer to String -> ex. int num=10; ---> convert num in String -> Integer.toString(num), String.valueOf(num) and to convert from String to integer
//to convert from String to integer then->  ex: String str="Vishal"; -> Integer.parseInt(str)


package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCode {
    public static void main(String[] args) {

    /*    //java program to count the total number of character in a string.
        String str="Vishal Raj1234456789";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println("No of character is :"+count);
    }


/**
 *This logic is used for Reverse a number
 */

     /*   Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = sc.nextInt();
        int rev = 0;
        int palin = num;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse Number is :" + rev);
        if (palin == rev) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
        //Find No of Even and Odd Digits in Number( for ex:num=123421234 even=5,odd=4) and Count number of digit
      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = sc.nextInt();
        int count = 0;
        int rem = 0;
        int sumOfDigit=0;
        int evenCount = 0;
        int oddCount = 0;
        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            count = count + 1;
            if (rem % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
            sumOfDigit=sumOfDigit+rem;
        }
        System.out.println(" Number of digits :" + count);
        System.out.println(" Number of event digits :" + evenCount);
        System.out.println(" Number of odd digits :" + oddCount);
        System.out.println("Sum of all digits :"+sumOfDigit);*/

        /// Find Java program to count the total number of vowels and consonants in a String.
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
         str = str.toLowerCase();
        int countV = 0;
        int countCons = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                countV++;
            } else if (str.charAt(i) != ' ') {
                countCons++;
            }
        }
        System.out.println("Numbers of vowels present in String :" + countV);
        System.out.println("Numbers of Consonant present in String :" + countCons);
    */

//Remove White Spaces in a String..
      /*  String str = "My Name is  Vishal    Raj";
        str = str.replaceAll("\\s", "");
        System.out.println("After removing white spaces in String:" + str);*/


        //Check whether the given year is a Leap year.
     /*   Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("This is Leap Year :" + year);
        } else {
            System.out.println("This is Not a Leap Year :" + year);
        }*/

//1. Swap three numbers
     /*   int a = 5, b = 10, c = 15;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Swapping using addition and subtraction
        a = a + b + c;  // a = 5 + 10 + 15 = 30
        b = a - b - c;  // b = 30 - 10 - 15 = 5
        c = a - b - c;  // c = 30 - 5 - 15 = 10
        a = a - b - c;  // a = 30 - 5 - 10 = 15

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        //one more approach
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Swapping using XOR operations
        a = a ^ b ^ c;
        b = a ^ b ^ c;
        c = a ^ b ^ c;
        a = a ^ b ^ c;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);*/
        /** How XOR Swapping Works:
         When you XOR two numbers together, each bit of the result is set to 1 if the corresponding bits of the operands are different, and 0 if they are the same.
         */
        //=========================================================================================================================================
        //In Fibonacci series, next number is the sum of previous two numbers
        /** Input = First 10 Numbers
         Output = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
         The first two numbers of Fibonacci series are 0 and 1.*/
        int sum = 0;
        int pre = 0;
        int next = 1;
        int n = 1;
        while (n < 10) {
            sum=pre+next;
            System.out.println(sum+" ");
            pre=next;
            next=sum;
            n++;

        }

       /* int[] arr = {7, 4, 2, 9, 1};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 1]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }*/

//
      /*   String str = "ABdAkCkC";// output-->A=2, B=2,C=2,d=1,k=2
        char ch[] = str.toCharArray();
        int count = 0;
        char dup[] = new char[str.length()];
        int x = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    dup[x] = ch[j];
                    x++;
                    count++;
                    if (count > 0) {
                        //System.out.print(ch[i] +" ");//give duplicate
                    }
                }
            }
        }
        for (int i = 0;i < x; i++) {
            System.out.println("Non:" + dup[i] + " ");//duplicate
        }*/
//        //or count by using hashmap
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (int i = 0; i < ch.length; i++) {
//            if (hm.containsKey(ch[i])) {
//                hm.put(ch[i],hm.get(ch[i])+1);
//                System.out.println("duplicate key :" +ch[i]);//this will duplicate letters
//            }else {
//                hm.put(ch[i],1);
//            }
//        }
//        for (Map.Entry entry : hm.entrySet()) {
//            System.out.println(entry.getKey() + "   " + entry.getValue());//print frequency of each value
//        }
    }
}
