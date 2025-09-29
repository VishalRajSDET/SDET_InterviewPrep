package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class SwapTwoString {
    public static void main(String[] args) {
        String s1="Vishal";
        String s2="Raj";
//        System.out.println("Before swap .....");
//        System.out.println("The value of S1:"+s1);
//        System.out.println("The value of S2:"+s2);
//
//        s1=s1+s2;//VishalRaj
//        s2=s1.substring(0,s1.length()-s2.length());
//        s1=s1.substring(s2.length());
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
//
        System.out.println("After swap .....");
        System.out.println("The value of S1:"+s1);
        System.out.println("The value of S2:"+s2);

    }
}
