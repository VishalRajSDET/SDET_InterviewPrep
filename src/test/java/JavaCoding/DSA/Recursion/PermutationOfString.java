package JavaCoding.DSA.Recursion;

//YouTube : https://www.youtube.com/watch?v=vKQ6oUH02gw
public class PermutationOfString {
    //Print All The Permutations Of A String Using Recursion

    public static void permutation(char[] arr, int fixValue) {
        if (fixValue == arr.length - 1) {
            System.out.println(arr);
            return;
        }
        for (int i = fixValue; i < arr.length; i++) {
            swap(arr, i, fixValue);
            permutation(arr, fixValue + 1);
            swap(arr, i, fixValue);
        }
    }

    /**
     * FixValue tells which position we’re currently locking in place.
     * swap helps place each possible character at that position.
     * backtrack (second swap) restores the array after recursion.
     */


    public static void swap(char[] arr, int i, int fixValue) {
        char temp = arr[i];
        arr[i] = arr[fixValue];
        arr[fixValue] = temp;
    }

    public static void main(String[] args) {

        String str = "ABC";
        char[] c = str.toCharArray();
        permutation(c, 0);

    }

}
