package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.Arrays;

public class insertAndDelete {
    public static void main(String[] args) {
        //insert an element in array
//        int a[]={10,20,30,40,50};
//        int insert=100;
//        int pos=5;
//      for (int i=a.length-1;i<pos-1;i--){
//          a[i]=a[i-1];
//      }
//      a[pos-1]=insert;
//        System.out.println(Arrays.toString(a));

        // delete an element an array
        int a[] = {1,4,2, 3, 4, 5, 6,4};
        int del = 4;
        int count=0;
        int[] res = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != del) {
                res[count]=a[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

