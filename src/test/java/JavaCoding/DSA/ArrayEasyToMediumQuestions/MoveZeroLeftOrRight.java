package JavaCoding.DSA.ArrayEasyToMediumQuestions;

import java.util.Arrays;

public class MoveZeroLeftOrRight {

    public static void moveZeroLeft(int[] arr) {
        int n = arr.length;
        int start = n - 1; // pointer for placing non-zeros (from right)
        for (int right = n - 1; right >= 0; right--) {
            if (arr[right] != 0) {
                arr[start] = arr[right];
                start--;
            }
        }
        while (start >= 0) {
            arr[start] = 0;
            start--;
        }
    }

    public static void moveZeroRight(int[] arr) {
        int n = arr.length;
        int start = 0;
        for (int left = 0; left < n; left++) {
            if (arr[left] != 0) {
                arr[start] = arr[left];
                start++;
            }
        }
        while (start < n) {
            arr[start] = 0;
            start++;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {1, 0, 2, 0, 3, 0, 4};
//      //  moveZeroLeft(arr);
//        moveZeroRight(arr);
        int[] arr = {3, 0, 1, 0, 1, 0, 0, 9, 0};
        moveZeroLeft(arr);
        System.out.println("Move zero's :" + Arrays.toString(arr));

    }
}
