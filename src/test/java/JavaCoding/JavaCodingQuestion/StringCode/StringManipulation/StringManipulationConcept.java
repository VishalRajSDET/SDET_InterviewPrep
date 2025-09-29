package JavaCoding.JavaCodingQuestion.StringCode.StringManipulation;

public class StringManipulationConcept {
    public static void main(String[] args) {
        /**
         * Common StringBuilder / StringBuffer Methods
         * Here are some frequently used methods:
         * append(value): Adds the specified value (e.g., String, int, char) to the end of the sequence.
         * insert(offset, value): Inserts the specified value at a particular position.
         * delete(start, end): Removes characters from a specified range.
         * reverse(): Reverses the sequence of characters.
         * length(): Returns the current number of characters.
         * capacity(): Returns the total storage capacity currently allocated.
         * toString(): Converts the StringBuilder/StringBuffer object back into an immutable String object. This is usually the final step after you've finished building your string.
         */

        /**
         * StringBuilder and StringBuffer: For Mutable Strings
         * StringBuilder vs. StringBuffer
         * Both StringBuilder and StringBuffer provide almost identical functionality for building and manipulating character sequences. The key difference lies in thread safety:
         * StringBuffer:-------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
         * Thread-safe: All its methods are synchronized. This means that if multiple threads try to access and modify the same StringBuffer object simultaneously, Java ensures that only one thread can execute a method at a time. This prevents data corruption in multi-threaded environments.
         * Slower: Due to the overhead of synchronization, StringBuffer is generally slower than StringBuilder.
         * StringBuilder:-------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
         * Not thread-safe: Its methods are not synchronized. This means it's faster and more efficient for single-threaded environments (which is most common for general application logic).
         * Faster: Without the synchronization overhead, StringBuilder offers better performance.
         * Rule of Thumb:-------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
         * Use StringBuilder for single-threaded environments (most common scenario).
         * Use StringBuffer for multi-threaded environments where multiple threads might access the same string builder.
         */

        /**
         * String, StringBuilder, and StringBuffer all store their actual character data in the Heap memory.
         * Here's a breakdown:
         * String:
         * When you create a string literal (e.g., String s = "Hello";), the literal "Hello" is stored in a special area of the Heap called the String Pool.
         * When you create a string using new String("Hello"), a new object is created in the general Heap memory (outside the String Pool initially).
         * Regardless of how it's created, the actual character data ("H", "e", "l", "l", "o") resides on the Heap.
         * StringBuilder and StringBuffer:
         * Both StringBuilder and StringBuffer objects themselves, along with their internal, resizable character arrays (where the actual string data is kept), are allocated in the general Heap memory.
         * They don't use the String Pool. When you convert a StringBuilder or StringBuffer to a String using toString(), that resulting String object might then go into the String Pool if it's a literal or intern()ed, but the StringBuilder/StringBuffer itself operates entirely on the Heap.
         * In summary, the Heap is where all objects in Java, including string-related objects and their data, are stored. The String Pool is a specific optimized region within the Heap for immutable string literals.
         */

        /**
         * indexOf(String str) / indexOf(char ch): Returns the index of the first occurrence of the specified character or substring. Returns -1 if not found.
         String s = "example";
         int idx1 = s.indexOf('a');     // idx1 is 1
         int idx2 = s.indexOf("amp");   // idx2 is 2
         */

        /**
         * substring(int beginIndex) / substring(int beginIndex, int endIndex): Extracts a portion of the string. endIndex is exclusive.
         * String s = "Programming";
         * String sub1 = s.substring(3);    // sub1 is "gramming"
         * String sub2 = s.substring(0, 4); // sub2 is "Prog"
         */

        /**
         * trim(): Removes leading and trailing whitespace.
         * String s = "  Hello World  ";
         * String trimmed = s.trim(); // trimmed is "Hello World"
         */

        /**
         * lastIndexOf(String str) / lastIndexOf(char ch): Returns the index of the last occurrence.
         */

        /**
         * replace(char oldChar, char newChar) / replace(CharSequence target, CharSequence replacement): Replaces occurrences of a character or substring with another.
         * String s = "banana";
         * String newS = s.replace('a', 'o'); // newS is "bonono"
         * /
         /**
         * startsWith(String prefix) / endsWith(String suffix): Checks if the string begins or ends with a specific prefix/suffix.
         */

        /**
         * contains(CharSequence s): Checks if the string contains the specified sequence of characters.
         */

        /**
         * split(String regex): Splits the string into an array of substrings based on a delimiter (a regular expression).
         * String data = "apple,banana,cherry";
         * String[] fruits = data.split(","); // fruits = {"apple", "banana", "cherry"}
         * /

         /**
         * concat(String str): Concatenates the specified string to the end of this string. (Functionally similar to + operator).
         *
         * isEmpty() / isBlank(): isEmpty() checks if the string's length is 0. isBlank() (Java 11+) checks if the string is empty or contains only whitespace.
         */

        /**
         * Regular Expressions (Regex) 🔍
         * For more advanced pattern matching and manipulation, Java's String class (and the java.util.regex package) supports regular expressions.
         * Regular expressions are powerful sequences of characters that define a search pattern.
         *
         * --> matches(String regex): Checks if the entire string matches the given regular expression.
         * String email = "test@example.com";
         * boolean isValid = email.matches("\\w+@\\w+\\.\\w+"); // true for valid email format
         * ------------------------------------------------------------------------------------------
         * replaceAll(String regex, String replacement): Replaces all substrings that match the regex with the replacement string.
         * String text = "Hello 123 World 456";
         * String noDigits = text.replaceAll("\\d+", ""); // noDigits is "Hello  World " (removes all digits)
         *
         * replaceFirst(String regex, String replacement): Replaces only the first substring that matches the regex.
         */

        /**
         * String to char[]:
         * String s = "Hello";
         * char[] chars = s.toCharArray(); // chars = {'H', 'e', 'l', 'l', 'o'}
         */

        /**
         * char[] to String:
         * char[] chars = {'J', 'a', 'v', 'a'};
         * String s = new String(chars); // s is "Java"
         */

        /**
         * Understanding StringJoiner
         * StringJoiner simplifies the task of constructing a sequence of characters separated by a delimiter and optionally starting with a prefix and ending with a suffix. Before StringJoiner, you'd typically use StringBuilder and manually manage appending commas, checking for the first element, etc., which could get cumbersome.
         *
         * The Constructor: StringJoiner(delimiter, prefix, suffix)
         * The most common way to create a StringJoiner is by providing three arguments to its constructor:
         *========================================================================================
         * delimiter: This is the character or string that will be placed between each added element.
         * In your example: ", " (a comma followed by a space).
         *=========================================================================================
         * prefix: This is the character or string that will be placed at the very beginning of the final joined string.
         * In your example: "[".
         *========================================================================================
         * suffix: This is the character or string that will be placed at the very end of the final joined string.
         * In your example: "]"
         */

        /**
         * What happens if you don't use prefix/suffix?
         * There's another constructor: StringJoiner(delimiter). If you use this, your string won't have a prefix or suffix.
         *
         * StringJoiner sjNoBoundaries = new StringJoiner("-"); // only a delimiter
         * sjNoBoundaries.add("One").add("Two").add("Three");
         * System.out.println(sjNoBoundaries.toString()); // Output: One-Two-Three
         */
    }
}
