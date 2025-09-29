package JavaCoding.DSA.ArrayEasyToMediumQuestions;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=ytEmPvnFKkE
 */
public class RotateArrayByKSteps {

    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, k - 1);// reverse 1st left k-1(why k-1, because index is start from 0 and if k=3 then it will be 0,1 ,2)
        reverse(arr, k, n - 1);// reverse left from k to last
        reverse(arr, 0, n - 1);// now final answer -> reverse completely
    }

    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
//        reverse(arr, 0, n - 1);     // Step 1: reverse whole array
//        reverse(arr, 0, k - 1);     // Step 2: reverse first k
//        reverse(arr, k, n - 1);     // Step 3: reverse remaining

        // 2nd approach
        reverse(arr, n-k, n - 1);     // Step 1: reverse last k
        reverse(arr, 0, n-1-k);     // Step 2: reverse first n-1-k
        reverse(arr, 0, n - 1);     // Step 3: reverse all
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rightRotate(arr, k);
       // leftRotate(arr, k);
        System.out.print("Rotated Array: "+ Arrays.toString(arr));
    }
    /**
     * Right Rotation (by k steps)
     * [1,2,3,4,5], k=1 → [5,1,2,3,4]
     * [1,2,3,4,5], k=2 → [4,5,1,2,3]
     * [1,2,3,4,5], k=3 → [3,4,5,1,2]
     * [1,2,3,4,5], k=5 → [1,2,3,4,5]
     * Left Rotation (by k steps)
     * [1,2,3,4,5], k=1 → [2,3,4,5,1]
     * [1,2,3,4,5], k=2 → [3,4,5,1,2]
     * [1,2,3,4,5], k=3 → [4,5,1,2,3]
     * [1,2,3,4,5], k=5 → [1,2,3,4,5]
     */
}
