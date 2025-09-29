package JavaCoding.DSA.SlidingWindowProblems;

/**
 * 📌 Problem Statement
 * Given an array of integers arr[] and an integer k,
 * find the maximum sum of any contiguous subarray of size k.
 */
public class MaximumSubArraySum {
    public static int maximumSubArraySum(int[] arr, int k) {
        int windSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            windSum = windSum + arr[i];
        }
        maxSum = windSum;
        for (int i = k; i < arr.length; i++) {

            // Slide the window:
            // 1. Remove the element that is going out of the window (arr[i - k])
            // 2. Add the new element entering the window (arr[i])
            // This way, the window always remains of size 'k'
            /**
             * Since the window size is fixed (k), every time we move the window one step to the right,
             * we must drop the first element of the previous window (arr[i-k]) and add the next element (arr[i]) to maintain the correct sum.”
             */
            windSum = windSum + arr[i] - arr[i - k];
            maxSum = Math.max(windSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum Sum of Subarray of Size " + k + " = " + maximumSubArraySum(arr, k));//9
    }
    /**
     * 🕒 Complexity
     * Time: O(n) → only one pass through the array.
     * Space: O(1) → no extra space needed.
     */
}
