package JavaCoding.DSA.ArrayEasyToMediumQuestions.KthLargestOrSmallestElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class findKthLargestNumberWithoutPriorityQueue {

    public static int findKthLargestElement(int[] num, int k) {

        TreeSet<Integer> set = new TreeSet<>();
        // Case 1: If kth unique element exists
        for (int i : num) {
            set.add(i);
        }
        if (set.size() >= k) {
            ArrayList<Integer> list = new ArrayList<>(set);
            //return list.get(list.size() - k); // kth largest unique
            return list.get(k - 1);              // kth smallest unique
        } else {
            Arrays.sort(num);
            // return num[num.length - k]; // kth largest = from right
            return num[k - 1];// kth smallest = from left
        }
    }

    public static void main(String[] args) {
        int k = 2;
        int[] num = {5, 4, 1, 2, 3, 4, 5, 1, 2};
        int result = findKthLargestElement(num, k);
        System.out.println("The " + k + "th largest unique element is: " + result);
    }
}
