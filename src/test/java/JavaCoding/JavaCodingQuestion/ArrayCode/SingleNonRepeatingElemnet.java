package JavaCoding.JavaCodingQuestion.ArrayCode;

public class SingleNonRepeatingElemnet {
    public static int singleNumber(int[] num){
        int single=num[0];
        for(int i=1;i<num.length;i++){
            //xor the element with the previous result
            //Note: Let's understand XOR bitwise operator --> A^A=0  , A^0=A and XOR is commutative ex. A^B^C=A^C^B
            single=single^num[i];
        }
        return single;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,1,3};
        System.out.println("Single Non Repeating Number :"+singleNumber(arr));//3
    }
}
