package JavaCoding.DSA.ArrayEasyToMediumQuestions.KthLargestOrSmallestElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class findKthLargestNumber {

    public static int getKthLargestNumber(int[] num, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : num) {
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : list) {
            priorityQueue.add(i);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int k = 2;
        int[] arr = {3,6, 2, 5, 3, 4, 4, 5, 4};
        int result = getKthLargestNumber(arr, k);
        System.out.println("The " + k + "th largest unique element is: " + result);
    }
}
