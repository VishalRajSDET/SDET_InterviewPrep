package JavaCoding.JavaCodingQuestion.ArrayCode;

public class SearchElement {
    public static void main(String[] args) {
        int[] a={1,2,94,2,33,45,90};
        int search=2;
        int count=0;
        for (int i=0;i<a.length;i++){
            if(a[i]==search){
                count++;
                System.out.println("Element :"+a[i]+" present at index :"+i);
            }
        }
        /*
        output-> Element :2 present at index :1
                Element :2 present at index :3
         */
    }
}
