package JavaCoding.DSA.ArrayEasyToMediumQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    /**
     * An element is called a leader if it is greater than all the elements to its right in the array.
     * <p>
     * The rightmost element is always a leader.
     * int[] arr = {16, 17, 4, 3, 5, 2};
     * Leaders: 17, 5, 2
     */
    public static List<Integer> findLeaders(int[] arr) {

        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int leaderSoFar = arr[n - 1]; // last element is always leader
        leaders.add(leaderSoFar);  // last element is always leader
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > leaderSoFar) {
                leaders.add(arr[i]);
                leaderSoFar = arr[i];
            }
        }
        Collections.reverse(leaders);  // optional, to print in array order
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {100, 16, 17, 6, 4, 3, 5, 2};
        System.out.println("Leaders: " + findLeaders(arr)); // Leaders: [100, 17, 6, 5, 2]
    }
    /**
     * Time: O(n) → single pass from right to left
     * Space: O(n) → for storing leaders
     */


    //Leaders in Array — O(n) Time, O(1) Space

  /*  public class LeadersInArray {

        public static void printLeaders(int[] arr) {
            int n = arr.length;
            int maxSoFar = arr[n - 1];

            // Rightmost element is always a leader
            System.out.print(maxSoFar + " ");

            // Traverse from second last to first element
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] > maxSoFar) {
                    System.out.print(arr[i] + " ");
                    maxSoFar = arr[i];
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {16, 17, 4, 3, 5, 2};
            System.out.print("Leaders: ");
            printLeaders(arr);  // Output: 2 5 17
        }
    }
    *
   */

}
