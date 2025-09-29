package JavaCoding.DSA.ArrayEasyToMediumQuestions;

public class CheckSortedArray {

    public static boolean isSorted(int[] arr) {
        boolean asc = true;
        boolean dsc = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                asc = false;
            }
            if (arr[i] < arr[i + 1]) {
                dsc = false;
            }
        }
        return asc || dsc; // Return true if the array is sorted in either ascending or descending order

    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};  // ascending
        int[] arr2 = {5, 4, 3, 2, 1};  // descending
        int[] arr3 = {1, 3, 2, 4, 5};  // not sorted
        System.out.println(isSorted(arr1)); // true
//        System.out.println(isSorted(arr2)); // true
       // System.out.println(isSorted(arr3)); // false
    }
}
