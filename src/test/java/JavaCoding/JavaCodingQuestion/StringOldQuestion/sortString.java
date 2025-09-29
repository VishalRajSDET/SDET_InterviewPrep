package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class sortString {
    public static void main(String[] args) {
        String input = "cbaed1 AB Hv";
        String sortedString = bubbleSort(input);
        System.out.println("Sorted string: " + sortedString); // Output: Sorted string: abcde
    }

    public static String bubbleSort(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;

        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    // Swap chars[j] and chars[j + 1]
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        // Convert char array back to string
        return new String(chars);
    }
}
