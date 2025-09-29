package JavaCoding.DSA.SlidingWindowProblems;

/**
 * 📌 Problem Statement
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find the contiguous subarray of length k that has the maximum average value and return this value.
 */
public class MaximumAverageSubarray {

    public static double findMaxAverage(int[] arr, int k) {
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }
        double maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            // Slide the window:
            // 1. Remove the element that is going out of the window (arr[i - k])
            // 2. Add the new element entering the window (arr[i])
            // This way, the window always remains of size 'k'
            /**
             * Since the window size is fixed (k), every time we move the window one step to the right,
             * we must drop the first element of the previous window (arr[i-k]) and add the next element (arr[i]) to maintain the correct sum.”
             */
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println("Maximum Average Subarray = " + findMaxAverage(arr, k));
    }
    /**
     * 🕒 Complexity
     * Time: O(n) → only one pass through the array.
     * Space: O(1) → constant extra space.
     */
}
