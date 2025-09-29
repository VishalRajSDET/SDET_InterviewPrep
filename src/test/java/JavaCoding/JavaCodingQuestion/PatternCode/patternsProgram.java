package JavaCoding.JavaCodingQuestion.PatternCode;

public class patternsProgram {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int s = row - 1; s < row; s++) {
                System.out.print(" ");
            }
            for (int col = row; col <= n; col++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}

