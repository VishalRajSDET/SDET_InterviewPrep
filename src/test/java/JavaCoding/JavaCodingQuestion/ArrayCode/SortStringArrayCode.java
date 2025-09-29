package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.Arrays;

public class SortStringArrayCode {
    public static void main(String[] args){
        String[] a={"Vishal","Aman","Lavkush"};
//        String temp;
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                //logic a[j].compareTo(a[i])>0 or a[i].compareTo(a[j])<0 then output will be descending order [Vishal, Lavkush, Aman]
//                if(a[i].compareTo(a[j])>0){// [Aman, Lavkush, Vishal]
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
        String temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i].compareTo(a[j])<0){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array :"+ Arrays.toString(a));


    }
}
