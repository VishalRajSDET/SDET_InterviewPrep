package JavaCoding.DSA.ArrayEasyToMediumQuestions;

import java.util.Arrays;

public class MaximumSubarray {

    public static void maxSubArray(int[] arr) {
        int maxSoFar = arr[0]; //keeps the largest sum seen so far
        int curMax = arr[0]; //keeps the sum of the current subarray being considered.
        int start = 0; //start index of the best subarray found so far.
        int end = 0; //end index of the best subarray found so far.
        int tempStart = 0; //temporary start index of the current subarray(used to track when we start a new subarray).

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > curMax + arr[i]) {
                curMax = arr[i];
                tempStart = i; // start new subarray
            } else {
                curMax = curMax + arr[i];
            }
            if (curMax > maxSoFar) {
                maxSoFar = curMax;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("Maximum Sub Array sum:" + maxSoFar);
        System.out.println("Maximum Sub Array :" + Arrays.toString((Arrays.copyOfRange(arr, start, end + 1))));
        /**
         * Arrays.copyOfRange(arr, start, end + 1) → extracts the subarray from start to end inclusive.
         * Prints the sum and the subarray itself.
         */
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
/**
 * Time Complexity: O(n)
 * Space Complexity: O(1) (ignoring the subarray copy)
 */
    }
}
