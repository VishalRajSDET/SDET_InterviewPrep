package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.Arrays;

public class RotateNegativeToLeft {
    public static void main(String[] agrs) {
        //int[] array = {1, 2, -6, 5, 3, -1};
        int[] array={1,4,-3,0,5,-2,0,9,0,-4};//Rotated array: 1 4 0 5 0 9 0 -2 -3 -4
        rotateNegativesToLeft(array);
        // Print the rotated array
        System.out.print("Rotated array: ");
        for (int num : array) {
            System.out.print(num + " "); }
        System.out.println();
    }
    public static void rotateNegativesToLeft(int[] arr) {
        int n = arr.length;
        int j = 0; // Pointer to track the position for negative numbers
        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                // Swap arr[i] with arr[j], where j is the current position for negative numbers
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                // Move j to the next position
                j++;
            }
        }
    }


    //OR----------------------------------------------------------------------------------------------------------------------------------------------------------------------
      /*  int[] a={7,-3,6,-2,9,-4,-5};
        int temp=0;
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){//if a[i]<0 then all negative values will be right side, a[i]>0 then all negative values will be left side
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        for(int i: a){
            System.out.print(i +" ");
        }

        //rotate all zero's right side

           /*  int a[]={3,20,0,7,0,1,0,0,0};
        int x=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[x]=a[i];
                x++;
            }
        }
        for(int i=x;i<a.length;i++){
            a[i]=0;
        }
        System.out.println("Try programiz.pro"+Arrays.toString(a));
       */

    //-------------------------------------------------------------------------------------------------------------------
    // Rotate all zero's right side
       /* int[] arr = {1, 0, 3, 0, 0, 5, 9, 0, 7};
        int insertPosition = 0;
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // If current element is non-zero, move it to the insertPosition and increment insertPosition
                arr[insertPosition++] = arr[i];
            }
            // If arr[i] is zero, do nothing (skip it)
        }

        // Fill the rest of the array from insertPosition to the end with zeros
        while (insertPosition < arr.length) {
            arr[insertPosition++] = 0;
        }
        System.out.println(Arrays.toString(arr));*/

    //==============================================================================================================================
    //Rotate all negative number left side

}

