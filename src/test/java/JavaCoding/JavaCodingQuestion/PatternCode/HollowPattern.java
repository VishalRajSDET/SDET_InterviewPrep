package JavaCoding.JavaCodingQuestion.PatternCode;

public class HollowPattern {
    public static void main(String[] args) {
        int n=5;
       /* System.out.print("Print T Shape------------------------------------------------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==(n/2)+1){//if n is odd then go with ->i==1 or j==(n/2)+1 and if we want opposite T then i==n or j==(n/2)+1
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
        //-----------------------------------------------------------------------------------
    /*    System.out.println("Pint + Symbol-------------------------------------------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==(n/2)+1||j==(n/2)+1){//if n is odd then go with ->i==n/2)+1 or j==(n/2)+1
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
 //-----------------------------------------------------------------------------------------------
        System.out.println("Pint cross Symbol-------------------------------------------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n+1){//if n is odd then go with ->i==n/2)+1 or j==(n/2)+1
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
