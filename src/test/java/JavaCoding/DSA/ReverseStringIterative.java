package JavaCoding.DSA;

public class ReverseStringIterative {

    public static String reverseString(String str) {
        char[] c = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        // base case
        if (str == null || str.length() <= 1) {
            return str;
        }
        while (left <= right) {
            c[left] = str.charAt(right);
            c[right] = str.charAt(left);// to avoid swaping

           /* char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            */

            left++;
            right--;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println("Reverse the string :" + reverseString("abcd"));
    }
}
