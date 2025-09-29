package JavaCoding.DSA.ArrayEasyToMediumQuestions;

import java.util.Arrays;

//Reverse array in-place
public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 10, 3, 11};
        reverseArray(arr);
        System.out.println("Reverse the Array :" + Arrays.toString(arr));
    }
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
}
