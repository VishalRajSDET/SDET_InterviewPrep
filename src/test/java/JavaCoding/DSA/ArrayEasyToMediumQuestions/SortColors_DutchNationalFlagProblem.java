package JavaCoding.DSA.ArrayEasyToMediumQuestions;

import java.util.Arrays;

//YouTube: https://www.youtube.com/watch?v=6sMssUHgaBs
public class SortColors_DutchNationalFlagProblem {

    public static int[] sortColors(int[] arr){
        int start=0; // Next position for 0
        int end=arr.length-1; // Next position for 2
        int mid=0; // Current element under consideration
        while(mid<=end){
            switch (arr[mid]){
                case 0:
                    swap(arr,start,mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,end);
                    end--;
                    break;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,0, 2, 1, 2, 0, 1, 0};
        int[] sort=sortColors(arr);

        System.out.println(Arrays.toString(sort));//[0, 0, 0, 1, 1, 1, 2, 2]
    }
}
