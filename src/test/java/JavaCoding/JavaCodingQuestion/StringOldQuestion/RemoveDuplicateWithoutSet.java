package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateWithoutSet {

//    public static String removeDuplicate(String str) {
//        StringBuilder sb = new StringBuilder();
//        for (char c : str.toCharArray()) {
//            if (!sb.toString().contains(String.valueOf(c))) {
//                sb.append(c);
//            }
//        }
//        return sb.toString();
//    }
//
//    public static int[] getSortArray(int[] arr){
//        for(int i=0; i<)
//
//        return arr;
//    }

    public static void main(String[] args) {
//        System.out.println(removeDuplicate("VishalRaj")); //VishalRj
//        System.out.println(removeDuplicate("AmanRaj")); //AmanRj
//        System.out.println(removeDuplicate("LavkushRaj")); //LavkushRj
        List<String> result = new ArrayList<>();

        String[] arr = {"Vishal", "Aman", "Shiva", "Antima", "Rohan", "Vivek"};
        for (String s : arr) {
            if(s.startsWith("Vi")){
                result.add(s);
            }
        }
        System.out.println(result);
    }

}
