package JavaCoding.JavaCodingQuestion.PatternCode;

//https://youtu.be/NWdrh3bayVI?si=Q2u1JzWXLitCYsjE
public class NumberPattern {
    public static void main(String[] args) {
        int n = 4;
        /**
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------");

        /**
         * 1
         * 2 1
         * 3 2 1
         * 4 3 2 1
         */
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
        /**
         * 4
         * 4 3
         * 4 3 2
         * 4 3 2 1
         */
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > (n - i); j--) {
                System.out.print(" " + j);
            }System.out.println();
        }
        System.out.println("--------------------------------------");
        /**
         * 4
         * 3 4
         * 2 3 4
         * 1 2 3 4
         */
        for (int i = 1; i <= n; i++) {
            for (int j = n-i+1; j<=n; j++) {
                System.out.print(" " + j);
            }System.out.println();
        }
        System.out.println("--------------------------------------");
        /**
         * 4 3 2 1
         * 4 3 2
         * 4 3
         * 4
         */
        for (int i = 1; i <= n; i++) {
            for (int j = n; j>=i; j--) {
                System.out.print(" " + j);
            }System.out.println();
        }
        System.out.println("--------------------------------------");
        /**
         * 4 3 2 1
         * 3 2 1
         * 2 1
         * 1
         */
        for (int i = 1; i <= n; i++) {
            for (int j = n-i+1; j >=1; j--) {
                System.out.print(" " + j);
            }System.out.println();
        }
        System.out.println("--------------------------------------");
        //=================================================================================
        /**
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         */
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >=i; j++) {
                System.out.print(" " + i);
            }System.out.println();
        }
        System.out.println("--------------------------------------");

    }
}
