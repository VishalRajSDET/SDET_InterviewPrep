package JavaCoding.DSA.ArrayEasyToMediumQuestions;

import java.util.*;

public class TwoSumAllPairs {
    /**
     * So the choice depends on the interviewer’s question:
     *
     * If they say "return any one pair" → HashMap is best.
     * If they say "return all unique pairs" → HashMap is fine.
     * If they say "return all possible pairs including duplicates" → use brute force.
     */

    public static List<int[]> twoSumAllPairs(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int find = target - arr[i];
            if (hm.containsKey(find)) {
                result.add(new int[]{hm.get(find), i});
            }
            hm.put(arr[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        List<int[]> allPairs=twoSumAllPairs(arr,target);
        for(int[] a: allPairs){
            System.out.println("Indices : (" +a[0]+","+a[1]+")");
            System.out.println("Values  : (" +arr[a[0]]+","+arr[a[1]]+")");
        }
    }
    /*
     * Time & space complexity is o(n)
     */
}
