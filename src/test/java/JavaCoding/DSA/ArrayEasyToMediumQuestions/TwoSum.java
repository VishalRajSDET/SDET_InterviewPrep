package JavaCoding.DSA.ArrayEasyToMediumQuestions;

import java.util.HashMap;

public class TwoSum {

    /**
     * return new int[]{find, arr[i]};
     * This is returning the values (the numbers themselves), not the indices.
     * <p>
     * But the standard Two Sum problem expects you to return the indices.
     * So instead, you should return:
     */
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int find = target - arr[i];
            if (hm.containsKey(find)) {
                return new int[]{hm.get(find), i};// ✅ return indices
            }
            hm.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8};
        int target = 10;
        int[] result = twoSum(arr, target);
        System.out.println("Indices: " + result[0] + "," + result[1]);
        System.out.println("Values: " + arr[result[0]] + "," + arr[result[1]]);
    }
}
