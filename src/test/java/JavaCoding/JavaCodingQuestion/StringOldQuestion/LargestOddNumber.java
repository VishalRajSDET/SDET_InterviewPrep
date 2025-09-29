package JavaCoding.JavaCodingQuestion.StringOldQuestion;

//Note: substring(beginIndex,endIndex); @param      beginIndex   the beginning index, inclusive.
//     * @param      endIndex     the ending index, exclusive.

public class LargestOddNumber {
    public static String getLargestOddNumber(String num) {
        for (int i=num.length()-1;i>=0;i--){
            if(Character.getNumericValue(num.charAt(i))%2!=0){
                return num.substring(0,i+1); }
        }
        return "";
    }
    public static void main(String[] args) {
        String str = "354227";
       // int len = str.length() - 1;
        System.out.println("Largest odd Number :" + getLargestOddNumber("223309"));//223309
        System.out.println("Largest odd Number :" + getLargestOddNumber("521"));//521
        System.out.println("Largest odd Number :" + getLargestOddNumber("4206"));
        System.out.println("Largest odd Number :" + getLargestOddNumber("3542"));//35
        System.out.println("Largest odd Number :" + getLargestOddNumber("2252"));//225
    }
}
