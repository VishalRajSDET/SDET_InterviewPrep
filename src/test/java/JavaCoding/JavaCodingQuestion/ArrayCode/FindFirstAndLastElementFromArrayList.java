package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstAndLastElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");
        if(!arrayList.isEmpty()){
            System.out.println("First Element from list :"+arrayList.get(0));//Apple
            System.out.println("Last Element from list :"+arrayList.get(arrayList.size()-1));//Elderberry
        }else {
            System.out.println("Arraylist is empty");
        }

        //Sort array
      /*  int a[]={4,2,1,5,8,3,6};
        for(int i=0; i<a.length-1;i++){
            int j=i+1;
            if(a[i]>a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i=-1;
            }
        }
        System.out.println(Arrays.toString(a));

       */
    }
}
