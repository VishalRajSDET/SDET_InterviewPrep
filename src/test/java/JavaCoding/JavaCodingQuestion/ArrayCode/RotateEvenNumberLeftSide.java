package JavaCoding.JavaCodingQuestion.ArrayCode;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateEvenNumberLeftSide {
    public static void main(String[] args) {
//        int[] a = {4, 1, 3, 2, 5};
//        List<Integer> evenList = new ArrayList<>();
//        List<Integer> oddList = new ArrayList<>();
//        for (int i : a) {
//            if (i % 2 == 0) {
//                evenList.add(i);
//            } else {
//                oddList.add(i);
//            }
//        }
//        int index = 0;
//        for (int i : evenList) {
//            a[index] = i;
//            index++;
//        }
//        for (int i : oddList) {
//            a[index] = i;
//            index++;
//        }
//        System.out.print(Arrays.toString(a));
     //   ------------------------------------------------------------------------------------------------------------------
        //Second approach
        int[] a = {4, 1, 3, 2, 5};
        int j=0;
        int temp=0;
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){//this logic if for event number in left side, and a[i]%2!=0 is for odd number left
                if(i!=j){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                j++;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
