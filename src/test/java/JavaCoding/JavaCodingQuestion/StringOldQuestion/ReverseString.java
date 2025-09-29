package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class ReverseString {
    public static void main(String[] args) {
        String str="My Name Is Vishal Raj";
        String[] arr=str.split(" ");
        String rev="";
        for (int i=arr.length-1;i>=0;i--){
            rev = rev+" "+arr[i];
        }

        System.out.println(rev);// Raj Vishal Is Name My

        /*
         String s="Geeks For Geeks";

        //initializing a stack of type char
        Stack<Character> stack=new Stack<>();

        for(char c:s.toCharArray())
        {
            //pushing all the characters
            stack.push(c);
        }

        String temp="";

        while(!stack.isEmpty())
        {
            //popping all the chars and appending to temp
            temp+=stack.pop();
        }

        System.out.println("Reversed string is : "+temp);

         */
    }
}
