package JavaCoding.JavaCodingQuestion.ArrayCode;

public class FindMaxAndMinEelementFromArray {
    public static void main(String[] args) {
        int[] a={4,16,9,2,88,77};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }else if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Maximum element :"+max);
        System.out.println("Minimum element :"+min);
    }
}
