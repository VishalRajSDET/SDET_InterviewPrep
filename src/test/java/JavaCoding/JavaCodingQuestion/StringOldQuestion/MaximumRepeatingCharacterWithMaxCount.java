package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.HashMap;

public class MaximumRepeatingCharacterWithMaxCount {
    public static void main(String[] args){
        String str="i am automation test engineer";// t=4
        String[] arr=str.split("");
        int maxCount=0;
        String maxOcc=null;
        HashMap<String,Integer> map=new HashMap<>();
        for(String s : arr){
            if(!s.equals(" ")){
             map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        for(String key: map.keySet()){
           if(maxCount<map.get(key)){
              maxCount=map.get(key);
              maxOcc=key;
           }
        }
        System.out.println(maxOcc+":"+maxCount);
    }
}
