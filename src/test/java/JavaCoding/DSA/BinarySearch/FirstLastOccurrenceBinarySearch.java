package JavaCoding.DSA.BinarySearch;

public class FirstLastOccurrenceBinarySearch {
    //Note: This approach we will use when array is sorted. if array is not sorted then we will go for Linear search
    public static int firstOccurrence(int[] arr, int target) {
        int result = -1;
        int end = arr.length - 1;
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int result = -1;
        int end = arr.length - 1;
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        int target = 3;
        int first = firstOccurrence(arr, target);
        // int last = lastOccurrence(arr, target);
        System.out.println("firstOccurrence :" + first);
        // System.out.println("lastOccurrence :" + last);
    }
/**
 * 3️⃣ Summary Table
 * Search Type	Best Case	Worst Case	Average Case	Space Complexity
 * Linear Search	O(1)	O(n)	    O(n)	        O(1)
 * Binary Search	O(1)	O(log n)	O(log n)	    O(1) (iterative) / O(log n) (recursive)
 */
}
