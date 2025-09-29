package JavaCoding.DSA.BinarySearch;

public class FirstLastOccurrenceLinearSearch {

    public static void firstAndLastOccurrence(int[] arr, int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i; // first time we see target
                }
                last = i; // keep updating last
            }
        }
        if (first != -1) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
        } else {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 6, 3, 2};// First occurrence: 1 , Last occurrence: 6
        int target = 2;
        firstAndLastOccurrence(arr, target);
    }
    /**
     * 3️⃣ Summary Table
     * Search Type	Best Case	Worst Case	Average Case	Space Complexity
     * Linear Search	O(1)	O(n)	    O(n)	        O(1)
     * Binary Search	O(1)	O(log n)	O(log n)	    O(1) (iterative) / O(log n) (recursive)
     */
}
