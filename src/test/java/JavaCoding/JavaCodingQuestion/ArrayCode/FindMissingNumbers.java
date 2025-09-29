package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.*;

public class FindMissingNumbers {
    public static void main(String[] args) {
     /*   int[] a={1,2,3,4,6};
        int n=a.length+1;
        int totalSum=n*(n+1)/2;
        int arraySum=0;
        for (int i: a){
            arraySum=arraySum+i;
        }
        System.out.println("Missing number is :"+(totalSum-arraySum));*/
        //============================================================================================
        // int array[]={1,3,5,6,10};//output=[2,4,7,8,9]
        int[] array = {10, 3, 5, 6, 2};//[1, 4, 7, 8, 9]
        int maxNum = Arrays.stream(array).max().getAsInt();
        Set<Integer> numSet = new HashSet<>();
        List<Integer> missing = new ArrayList<>();
        for (int i : array) {
            numSet.add(i);
        }
        for (int i = 1; i <= maxNum; i++) {
            if (!numSet.contains(i)) {
                missing.add(i);
            }
        }
        System.out.println("missing numbers :" + missing);
    }
}
