package JavaCoding.JavaCodingQuestion.PatternCode;

public class StarPattern {
    public static void main(String[] args) {
        int n=6;
        /**
         *    *
         *   **
         *  ***
         * ****
         */
        for (int i=1;i<=6;i++){
            for (int s=n-i;s>=1;s--){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //=====================================================================================
        /**
         * ****
         *  ***
         *   **
         *    *
         */
      /*  System.out.println("------------------------------------------------------------------");
        for (int i=1;i<=n;i++){
            for (int s=i-1;s>=1;s--){
                System.out.print(" ");
            }
            for (int j=n-i+1;j>=1;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
 //================================================================================================================
        /**
         *     *
         *    * *
         *   * * *
         *  * * * *
          */
// Note: logic is exactly same as 1st code just i need add one space in j loop SOP then we will this result
       /* System.out.println("-------------------------------------------------");
        for (int i=1;i<=4;i++){
            for (int s=n-i;s>=1;s--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" *");// only changes here i did apart from this 1st code logic is same, added space before *
            }
            System.out.println();
        }*/

        //=====================================================================================
        /**
         * ------------------------------------------------------------------
         *  * * * *
         *   * * *
         *    * *
         *     *
         */
       /* System.out.println("------------------------------------------------------------------");
        for (int i=1;i<=n;i++){
            for (int s=i-1;s>=1;s--){
                System.out.print(" ");
            }
            for (int j=n-i+1;j>=1;j--){
                System.out.print(" *");// 2nd program logic only added space before *
            }
            System.out.println();
        }
        */
//==============================================================================================================================
        /*  *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
         */

      /*  for (int i=1;i<=n+1;i++){
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------");
        // Same thing for right side
        /**
         *     *
         *    **
         *   ***
         *  ****
         * *****
         *  ****
         *   ***
         *    **
         *     *
         */
     /*   for (int i=1;i<=n+1;i++){
            for (int s=n-i+1;s>=1;s--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int s=n-i+1;s>=1;s--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        */
       // Note: at line 107 & 116 before * if give space then it will print Barfi(Diamond) shape triangle
/**
 *      *
 *     * *
 *    * * *
 *   * * * *
 *  * * * * *
 *   * * * *
 *    * * *
 *     * *
 *      *
 */

    }
}
