package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.Arrays;

public class FrequencyCounterWithoutHashmap {

    public static void countFrequency(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        int currentEle = arr[0];
        int count = 1;
        int maxCount=0;
        int moreOcc=0;
        for (int i = 1; i < len; i++) {
            if (arr[i] == currentEle) {
                count++;
            } else {
                System.out.print("[" + currentEle + " : " + count + "]");
//                if(count>maxCount){
//                    maxCount=count;
//                    moreOcc=currentEle;
//                }
                currentEle = arr[i];
                count = 1;
            }
        }
//        System.out.println();
//        System.out.println("Maximum count with element :"+"[" + moreOcc + " : " + maxCount + "]");
    }

    /**
     * Commented line will help for to get frequency of max with count
     */

    public static void main(String[] args) {
//        int[] arr1 = {1, 9, 4, 2, 3, 4, 4, 5, 1, 1, 2, 20, 10, 0, 6};// time complexity is O(NlogN).
//        countFrequency(arr1); // output--> [0 : 1][1 : 3][2 : 2][3 : 1][4 : 3][5 : 1][6 : 1][9 : 1][10 : 1]


    }

}
