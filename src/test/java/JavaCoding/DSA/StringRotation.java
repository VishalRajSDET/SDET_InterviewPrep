package JavaCoding.DSA;

public class StringRotation {
    /**
     * https://youtu.be/XadAO0gKA80?si=59YYfq4x6UyIRfa9
     * @param str1
     * @param str2  -> goal ( it should be rotation str1 then return true)
     * @return
     */

    public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        String temp=str1 + str1; //goal ( it should be rotation str1 then return true)
        return temp.contains(str2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("abcd", "cdab")); // true
        System.out.println(isRotation("abcd", "acbd")); // false
        System.out.println(isRotation("waterbottle", "erbottlewat")); //true
        System.out.println(isRotation("aaaa", "aaaa")); // true
    }
}
