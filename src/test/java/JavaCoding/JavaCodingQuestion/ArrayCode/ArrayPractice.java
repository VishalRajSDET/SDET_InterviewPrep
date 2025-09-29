package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayPractice {

    public static void main(String[] args) {

        //-------------------------------------------------------------------------------------------------------------------------------------
        /**
         * Find frequency of each value
         */
     /*   int[] arr = {1, 2, 2, 11, 11,2,5,2,1};
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]))// HashMap does not have any key then It will goto else condition and it will create one key
            {
                hm.put(arr[i], hm.get(arr[i]) + 1);// hm.get(arr[i]) is the key that take value from HashMap
            } else {
                hm.put(arr[i], 1);// creating 1st key -> arr[i] and value -> 1 and key will be frequency ,If key is not present in map then it will create one value
            }
        }
        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());//print frequency of each value
        }*/
        //------------------------------------------------------------------------------------------------------------------------------------------
        /**
         * Questions -> Find Maximum Reapiting Number with Count
         * ele : element that need to be count
         * max : maximum count of element
         */
     /*   int[] arr = {1, 1, 6, 6, 3, 3};
        int ele = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                }
            }
            if (count > max) {//note int[] arr={1,1,2,2,3,3}; all element same no of reapition then this logic 1st element with count of reapition and if(count>=max) then last element with count
                max = count;
                ele = arr[i];
            }
        }
        System.out.println("Element : " + ele + " Count : " + max);
    }
*/
        //-------------------------------------------------------------------------------------------------------------------------------------

        /**Find Maximum and Minimum element from array
         */
//        Integer a[]={5,4,3,2,1,-1,0};
//        int max=a[0];
//        int min=a[0];
//        for(int i=0;i<a.length;i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//            else if(a[i]<min){
//                min=a[i];
//            }
//        }
//        System.out.println("Maximum Element :"+max);
//        System.out.println("Minimum Element :"+min);
//        //without using loop also we can get min and maximum value from array by using inbuilt method sort()
//        Arrays.sort(a);
//        System.out.println("================================");
//        System.out.println(Arrays.toString(a));//[-1, 0, 1, 2, 3, 4, 5]
//        System.out.println("Maximum Element :"+a[a.length-1]);
//        System.out.println("Minimum Element :"+a[0]);
//
//        //without using loop also we can get min and maximum value from array by using inbuilt method reverse()
//
//        System.out.println("================================");
//        Arrays.sort(a, Collections.reverseOrder());//Collections.reverseOrder() method does not support int , we have to use Integer
//        System.out.println(Arrays.toString(a));//[5, 4, 3, 2, 1, 0, -1]
//        System.out.println("Maximum Element :"+a[0]);
//        System.out.println("Minimum Element :"+a[a.length-1]);
        //   ==============================================================================================
       /* String str = "My Name is Vishal Raj";
        String[] a = str.split("\\s");
        String rev="";
        String r="";
        for (int i = a.length - 1; i >= 0; i--) {
            rev=rev+" "+a[i];
        }
        System.out.println(rev);//output-> Raj Vishal is Name My
        String[] arr = {"Vishal", "Raj", "John", "Doe"};
        String result = Arrays.toString(arr);
        for (int i=str.length()-1;i>=0;i--){
            r=r+str.charAt(i);
        }
        System.out.println(r);


        //
      /*  int[] a={7,-3,6,-2,9,-4,-5};
        int temp=0;
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        for(int i: a){
            System.out.print(i +" ");
        }
    }*/

// Find 2nd largest number from array without sort an array
      /*  int[] arr = {12, 35, 1, 10, 34, 1};
        int largest = arr[0];//take number from array
        int secondLargest = arr[5];// take any number
        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            // Update largest if current element is larger
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest) {
                // Update secondLargest if current element is smaller than largest but larger than secondLargest
                if (arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }
        System.out.println(secondLargest);*/

//        int[] a={4,2,6,1,9,7,3,5};
//        for(int i=0;i< a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i]>a[j]){
//                    int temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//       System.out.println(Arrays.toString(a));
//        System.out.println(a[2]);

        int[] a={1,2,2,5,1,10,3,4,1,10};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i)>1){
                System.out.print("["+i +" : "+map.get(i)+"]");

            }
        }
    }
}



