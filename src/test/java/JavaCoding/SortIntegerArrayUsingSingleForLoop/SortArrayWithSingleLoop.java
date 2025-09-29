package JavaCoding.SortIntegerArrayUsingSingleForLoop;

import java.util.Arrays;

public class SortArrayWithSingleLoop {

    public static int[] getSortedArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int j = i + 1; //next element
            if (arr[i] > arr[j]) { // it will sort in ascending order but , if we do arr[i]<arr[j] then descending order
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i = -1; // reset the value of i because if sort middle of array then again we have to look from starting is there any element left to sort
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 2, 4, 3};
        System.out.println("Before sort array :" + Arrays.toString(arr));
        System.out.println("After sort array :" + Arrays.toString(getSortedArray(arr)));
    }
}
