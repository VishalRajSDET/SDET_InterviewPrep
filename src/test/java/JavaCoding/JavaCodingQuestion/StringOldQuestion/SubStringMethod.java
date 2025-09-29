package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class SubStringMethod {
    public static void main(String[] args) {
        String str="Vishal Aman Lavkush";
        // 1st parameter is inclusive and 2nd is exclusive
        System.out.println(str.substring(0,8));//output->Vishal A
        System.out.println(str.substring(7,12));//Aman
        //if we only one parameter then it's mean that start from there only
        System.out.println(str.substring(12));//Lavkush
        System.out.println(str.substring(7));//Aman Lavkush
        System.out.println(str.substring(0));//Vishal Aman Lavkush
        System.out.println(str.substring(1));//ishal Aman Lavkush

    }
}
