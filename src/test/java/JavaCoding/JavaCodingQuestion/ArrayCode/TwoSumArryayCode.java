package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSumArryayCode {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,6,10};
        int sum=10;
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
        System.out.println("----------------------------------------------------------------------");

    }
}
