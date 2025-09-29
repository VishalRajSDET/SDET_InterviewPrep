package JavaCoding.DSA.ArrayEasyToMediumQuestions.Sorting;

import java.util.Arrays;

//Youtube : https://www.youtube.com/watch?v=CzIw2kiF5cc
public class SortArrayUsingMergeSort {
    public static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1; // size of left subarray
        int n2 = end - mid; // size of right subarray

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[start + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }
        // Merge temp arrays back into arr
        int i = 0;
        int j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 5, 3, 4};

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
