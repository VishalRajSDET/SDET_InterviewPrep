package JavaCoding.DSA;

public class PalindromeCheck {

    /**
     * without case Sensitive like (input =Aba then this not palindrome)
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str){
        if(str==null){
            return false;
        }
        int left=0;
        int right=str.length()-1;
        while (left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Case-Insensitive + Ignore Non-Alphanumeric (Best for Real Use)
     */
    public static boolean isPalindromeCaseInsensitiveIgnoreNonAlphanumeric(String str){
        if(str==null){
            return false;
        }
        int left=0;
        int right=str.length()-1;
        while (left<=right){
            while (left<right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(str.charAt(left))!= Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("is Palindrome :"+isPalindrome(""));// true
        System.out.println("is Palindrome :"+isPalindrome("Aba"));// false
        System.out.println("is Palindrome :"+isPalindrome("A man, a plan, a canal: Panama"));// false
        System.out.println("is Palindrome :"+isPalindrome("aba"));// true

        System.out.println();

        System.out.println("is isPalindromeCaseInsensitiveIgnoreNonAlphanumeric :"+isPalindromeCaseInsensitiveIgnoreNonAlphanumeric(""));// true
        System.out.println("is isPalindromeCaseInsensitiveIgnoreNonAlphanumeric :"+isPalindromeCaseInsensitiveIgnoreNonAlphanumeric("Aba")); // true
        System.out.println("is isPalindromeCaseInsensitiveIgnoreNonAlphanumeric :"+isPalindromeCaseInsensitiveIgnoreNonAlphanumeric("A man, a plan, a canal: Panama"));// true
        System.out.println("is isPalindromeCaseInsensitiveIgnoreNonAlphanumeric :"+isPalindromeCaseInsensitiveIgnoreNonAlphanumeric("aba")); // true

    }
}
