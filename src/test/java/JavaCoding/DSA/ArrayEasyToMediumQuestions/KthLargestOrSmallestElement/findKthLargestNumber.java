package JavaCoding.DSA.ArrayEasyToMediumQuestions.KthLargestOrSmallestElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class findKthLargestNumber {

    /**
     * Important Concept
     * PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
     * This is a Min Heap. That means: The smallest element always stays at the top (index 0) .Internally it rearranges itself after every insertion .It does NOT store elements in insertion order.
     * Heap maintains partial order, not full sorting.
     */
    public static int getKthLargestUniqueNumber(int[] num, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : num) {
            set.add(i);
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : set) {
            priorityQueue.add(i);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int k = 2;
        int[] arr = {3, 6, 2, 6, 5, 3, 4, 4, 5, 6, 4};
        int result = getKthLargestUniqueNumber(arr, k);
        System.out.println("The " + k + "th largest unique element is: " + result);
    }
}
