package JavaCoding.DSA.ArrayEasyToMediumQuestions;
import java.util.*;

public class TwoSumAllPairsBruteForce {
    /**
     * Notes
     * Time complexity → O(n²) (brute force).
     * This approach includes duplicates if present in the array (unlike HashMap).
     * Output formatting is already clean ((x,y) style).
     */
    public static void twoSumAllPairs(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                   System.out.println("Indices :("+i+","+j+")");
                   System.out.println("Values  :("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 10;
        twoSumAllPairs(arr,target);
    }
}
