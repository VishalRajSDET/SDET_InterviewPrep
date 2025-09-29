package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int a[]={4,5,1,3,2,1,5,9};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println(set);//[1, 2, 3, 4, 5, 9]
        System.out.println("===================================================================");
        //removed duplicate from ArrayList
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,5,3,5,2,4,1,6,3,9));
        ArrayList<Integer> arrayList1=new ArrayList<>(Arrays.asList(4,5,1,3,2,1,5,9));
        Set<Integer> set1=new HashSet<>(arrayList);
        Set<Integer> set2=new HashSet<>(arrayList);
        System.out.println("Remove Duplicate from ArrayList :"+set1);//[1, 2, 3, 4, 5, 6, 9]
    }
}
