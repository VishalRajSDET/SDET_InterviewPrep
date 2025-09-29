package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElementFromTwoArray {
    public static void main(String[] args) {
        int a1[]={4,1,2,9,3};
        int a2[]={1,2,7,5,9,3};
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a1.length;i++){
            set.add(a1[i]);
        }for (int i=0;i<a2.length;i++){
            if(set.contains(a2[i])){
                System.out.println("Common element :"+a2[i]);//1,2,9,3
            }else {
                set.add(a2[i]);
            }
        }
        System.out.println("Set :"+set);//[1,2,3,4,5,7,9]
    }
}
