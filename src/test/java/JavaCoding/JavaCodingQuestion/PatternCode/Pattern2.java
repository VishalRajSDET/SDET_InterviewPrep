package JavaCoding.JavaCodingQuestion.PatternCode;
//https://youtu.be/BXIQiK0pAqE?si=Ezp2iQjPP4YNO066
public class Pattern2 {
    public static void main(String[] args) {
        //Note: if < then ++ and if > then -- this can be for outer or inner loop
        //If row is same digit is same then we have to print row or outer loop(this is not only approach we can have multiple
        int n=4;
        /**
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
        //--------------------------------------------------------------------
        /**
         * 1 1 1 1
         * 2 2 2
         * 3 3
         * 4
         */
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
//-----------------------------------------------------------------------------
        /**
         * 4
         * 3 3
         * 2 2 2
         * 1 1 1 1
         */
        for(int i=n;i>=1;i--){
            for(int j=n-i+1;j>=1;j--){
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
        //-----------------------------------------------------------------------
        /**
         * 4 4 4 4
         * 3 3 3
         * 2 2
         * 1
         */
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" "+i);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

    }
}
