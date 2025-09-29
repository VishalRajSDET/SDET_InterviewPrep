package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class ReverseEachWord {
    public static void main(String[] args) {
        //reverse a String with each character reverse
        String str="My Name Is Vishal Raj";
        char[] ch=str.toCharArray();
        StringBuilder rev =new StringBuilder();
        for (int i=ch.length-1;i>=0;i--){
            rev.append(ch[i]);
        }
        System.out.println(rev);//jaR lahsiV sI emaN yM
//-------------------------------------------------------------------------------
        //reverse each word ex-> input="Vishal Raj" then output="lahsiV jaR"
        String str1="Vishal raj";
        String a[]=str1.split(" ");
        StringBuilder output=new StringBuilder();
        for(String word: a){
            StringBuilder revWord=new StringBuilder();
            for(int i=word.length()-1;i>=0;i--){
                revWord.append(word.charAt(i));
            }
            output.append(revWord).append(" ");//this approach i used to give space
        }
        System.out.println(output);//
    }
}
