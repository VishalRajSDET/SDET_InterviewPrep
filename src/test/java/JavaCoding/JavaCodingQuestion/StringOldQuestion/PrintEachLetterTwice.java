package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class PrintEachLetterTwice {
    public static void main(String[] args) {
//        String str = "Vishal";
//        String output = "";
//        for (int i = 0; i < str.length(); i++) {
//            output = output + str.charAt(i) + str.charAt(i);
//        }
        //System.out.println(output);//VViisshhaall
//Count no of words present in string
//        String str1 = "My name is                         Vishal   raj";
//        String[] a = str1.split(" ");
//        int count = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] != "") {
//                count++;
//            }
//        }
//        System.out.println(count);//5
        //print each letter 3 times
        String str1 = "My name is                         Vishal   raj";
        String string=str1.replaceAll(" ","");
        String[] a=string.split("");
        String output="";
        String add="";
        int times=3;
        for(int i=0;i<a.length;i++){
            if(a[i]!="") {
                int count = 0;
                while (count < times) {
                    add = add + a[i];
                    count++;
                }
                output = output + " " +add;
                add="";
            }
        }
        System.out.println("print "+ output);//MMM yyy nnn aaa mmm eee iii sss VVV iii sss hhh aaa lll rrr aaa jjj
    }
}
