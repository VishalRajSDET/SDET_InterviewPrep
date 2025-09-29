package JavaCoding.JavaCodingQuestion.PatternCode;

//https://youtu.be/X7_T1nEBXYs?si=5hEMjGq8vLex1Btp
// Star print all logic https://youtu.be/4KED-7xPQbQ?si=HmF-z7tEztoUkIlr
public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;
        /**
         *       4
         *     3 3
         *   2 2 2
         * 1 1 1 1
         */
        for (int i = n; i >= 1; i--) {
            for (int s = i - 1; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j >= 1; j--) {

                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
        /**
         *    E
         *   DD
         *  CCC
         * BBBB
         */

        for (int i = n; i >= 1; i--) {
            for (int s = i - 1; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j >= 1; j--) {

                System.out.print((char)(i+65));
            }
            System.out.println();
        }
    }

}
