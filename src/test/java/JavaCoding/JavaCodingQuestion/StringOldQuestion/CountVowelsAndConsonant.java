package JavaCoding.JavaCodingQuestion.StringOldQuestion;

import java.util.HashMap;


public class CountVowelsAndConsonant {
    public static void main(String[] args) {
//print each Vowels with count
        String s = "VishAl raj";
        char[] a = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 'a' || a[i] == 'i' || a[i] == 'e' || a[i] == 'o' || a[i] == 'u') {
//                if (map.containsKey(a[i])) {
//                    map.put(a[i], map.get(a[i]) + 1);
//                } else {
//                    map.put(a[i], 1);
//                }
//            }
//        }
//        for (char key : map.keySet()) {
//            System.out.println(key + ":" + map.get(key));//a:2, i:1
//        }


        //print each consonant with count
      /*  String vowels = "aeiouAEIOU";
        String con = "";
        char[] arr = vowels.toCharArray();
        //vowels.indexOf(a[i])==-1
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ') {
                //if (vowels.indexOf(a[i])==-1)
                //if (//a[i] != 'a' && a[i] != 'i' && a[i] != 'e' && a[i] != 'o' && a[i] != 'u') both give same result
                if (!vowels.contains(String.valueOf(a[i])))//above three logic will give same result
                {
                    con = con + String.valueOf(a[i]);
                    map.put(a[i], map.getOrDefault(a[i], 0) + 1);
                }
            }
        }
        System.out.println(con);//vshlrj only consonant
        System.out.println(map);//{r=1, s=1, v=1, h=1, j=1, l=1}
        for (char key : map.keySet()) {
            System.out.print(key + ":" + map.get(key) + " ");//r:1 s:1 v:1 h:1 j:1 l:1
        }
*/

        String s1="Vishal Raj";
        HashMap<Character,Integer> hm=new HashMap<>();
        String vowels="AEIOUaeiou";
        for(char c:s1.toCharArray()){
            if(!vowels.contains(String.valueOf(c)) && c!=' '){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
        }for(char c:hm.keySet()){
            System.out.print("["+c+" : "+hm.get(c)+"]" +" ");
        }
        System.out.println("no of vowels :"+ hm.size());
    }
}
