package JavaCoding.JavaCodingQuestion.StringOldQuestion;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        String str = "Hello World!";
        String vowels = "aeiouAEIOU";
        StringBuilder removeVowels = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) == -1) {// here vowels.indexOf(c) means if in vowels string character is match with c then it will return -1
                removeVowels.append(c);
            }
        }
        System.out.println("String before remove vowels :" + str);//Hello World!
        System.out.println("String after remove vowels :" + removeVowels);//Hll Wrld!
    }
}
