package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.*;

public class CharactersInDescendingOrderOfFrequency {
    public static void main(String[] args){
        String str="Banana";
        HashMap<Character,Integer> hm=new HashMap<>();

        for(char c:str.toCharArray()){
            if(c!=' '){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
        }

        List<Map.Entry<Character,Integer>> list= new ArrayList<>(hm.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));// descending order
       //list.sort((a,b)->a.getValue().compareTo(b.getValue()));// ascending order
        for(Map.Entry<Character,Integer> map: list){
            System.out.print("["+map.getKey() +" : "+map.getValue() +"] ");
        }
        //output for descending order: [a : 3] [n : 2] [B : 1]
        //output for ascending order : [B : 1] [n : 2] [a : 3]
    }
}
