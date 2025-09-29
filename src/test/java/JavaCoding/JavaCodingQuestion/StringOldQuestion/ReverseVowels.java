package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class ReverseVowels {

    public static String reverseVowels(String str) {
        int len = str.length() - 1;
        int start = 0;
        int end = len;
        char[] c = str.toCharArray();

        String vowels = "aeiouAEIOU";
        while (start <= end) {
            if (!vowels.contains(String.valueOf(c[start]))) {
                start++;
            } else if (!vowels.contains(String.valueOf(c[end]))) {
                end--;
            } else {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        System.out.println("After vowels reverse :" + reverseVowels("Vishal"));//Vashil
        System.out.println("After vowels reverse :" + reverseVowels("RajVishal"));//RajVishal
        System.out.println("After vowels reverse :" + reverseVowels("Aman"));//amAn
        System.out.println("After vowels reverse :" + reverseVowels("Lavkush"));//Luvkash

        //another best solution
     /*   String str="aieABBBB";
        char[] output=new char[str.length()];
        int left=0;
        int right=str.length()-1;
        String vowels="AEIOUaeiou";
        while(left<=right){
            if(vowels.indexOf(str.charAt(left))==-1){
                output[left]=str.charAt(left);
                left++;
            }else if(vowels.indexOf(str.charAt(right))==-1){
                output[right]=str.charAt(right);
                right--;
            }else{
                output[left]=str.charAt(right);
                output[right]=str.charAt(left);
                left++;
                right--;
            }
        }
        System.out.println(new String(output));*/
    }

    //Note: Same logic is for consonant reverse just at line no 13 & 15 we have to use not contains
}
