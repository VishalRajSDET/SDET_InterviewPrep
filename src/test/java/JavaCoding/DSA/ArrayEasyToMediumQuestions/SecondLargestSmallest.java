package JavaCoding.DSA.ArrayEasyToMediumQuestions;

public class SecondLargestSmallest {

    public static void secondLargestSmallest(int[] arr) {
        int n = arr.length;
        /**
         * note: here i have assigned randomly value from array
         *
         * or we can initialize this way also
         * int firstSmallest = Integer.MAX_VALUE;
         * int secSmallest   = Integer.MAX_VALUE;
         * int firstLar      = Integer.MIN_VALUE;
         * int secLar        = Integer.MIN_VALUE;
         */
        int firstSmallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        int firstLar = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLar) {
                secLar = firstLar;
                firstLar = arr[i];
            } else if (secLar < arr[i] && arr[i] < firstLar) {
                secLar = arr[i];
            }
            if (arr[i] < firstSmallest) {
                secSmallest = firstSmallest;
                firstSmallest = arr[i];

            } else if (secSmallest > arr[i] && firstSmallest < arr[i]) {
                secSmallest = arr[i];
            }
        }
        System.out.println("Second Largest element :" + secLar);//4
        System.out.println("Second Smallest element :" + secSmallest);//-1
    }


    public static void main(String[] args) {

//        int[] arr = {1, 2, -2, 5, 3, 3, 4, 1, -1, 2};
        int[] arr = {10, 9, 8, 7, 6};
        secondLargestSmallest(arr);
    }
}
