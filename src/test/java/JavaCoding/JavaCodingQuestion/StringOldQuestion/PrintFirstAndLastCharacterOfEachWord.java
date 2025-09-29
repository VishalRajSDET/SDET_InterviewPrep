package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class PrintFirstAndLastCharacterOfEachWord {
    public static void main(String[] args) {
        String str="My Name is Vishal Raj";
        String[] arr=str.split(" ");
        for(String s:arr){
            System.out.print(s.charAt(0)+" ");//Fist character of each word-> output-->M N i V R
        }
        System.out.println();
        for(String s:arr){
            System.out.print(s.charAt(s.length()-1)+" ");//Last Character of each word-> y e s l j
        }
     // count no off characters
        String str1="My Name is   Vishal Raj";
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);// count=17

    }
}
