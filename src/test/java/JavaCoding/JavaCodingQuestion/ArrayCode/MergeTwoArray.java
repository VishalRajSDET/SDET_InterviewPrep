package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.Arrays;
//Youtube: https://youtu.be/zwPUBnl6pBU?si=rV6P_HqRcAhEfQ8N
//https://youtu.be/xF3TU-QlhJQ?si=t9I7MX7vFpKQF0lh
public class MergeTwoArray {
    public static void main(String[] args) {
        int array1[]={9,10,11,12,13,2};
        int array2[]={4,5,6,7};
        int finalArray[]= new int[array1.length+array2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<array1.length && j<array2.length ){
            if(array1[i]<array2[j]){
                finalArray[k]=array1[i];
                i++;
                k++;
            }else {
                finalArray[k]=array2[j];
                k++;
                j++;
            }
        }
        while (i<array1.length){
            finalArray[k]=array1[i];
            k++;i++;
        }
        while (j<array2.length){
            finalArray[k]=array2[j];
            k++;j++;
        }
        System.out.println(Arrays.toString(finalArray));//[4, 5, 6, 7, 9, 10, 11, 12, 13, 2]
    }
}
