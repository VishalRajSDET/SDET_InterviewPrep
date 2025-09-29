package JavaCoding.JavaCodingQuestion.ArrayCode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElementCode {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 2, 5, 7, 3, 1};
        List<Integer> duplicate = new ArrayList<>();
        List<Integer> nonDuplicate = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            boolean isPresent = false;
            int count=0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
//                    isPresent = true;
                    count++;
                    if(count>0) {
                        if (!duplicate.contains(a[i])) {
                            duplicate.add(a[i]);
                        }
                    }
                }
            }
            if (count==0) {
                if(!duplicate.contains(a[i])) {
                    nonDuplicate.add(a[i]);
                }
            }
        }
        System.out.println("Duplicate Element:" + duplicate);
        System.out.print("Non Duplicate Element:" + nonDuplicate);
    }
}
