package JavaCoding.DSA.SlidingWindowProblems;

public class SlidingWindowQuestionLists {


    /**
     * Note: Nikhil Lohia -> Coding Interview Patterns - Sliding Window | 10 different problems in a single video -> https://www.youtube.com/watch?v=tk38CTSAYsg
     * Maximum Sum of Subarray of Size K
     * Maximum Average of Subarray of Size K -> YouTube -> https://www.youtube.com/watch?v=56TxHMG0qhQ
     * Maximum vowels in substring of size k
     * Types of Sliding Window
     * Longest substring without repeating character -> YouTube -> https://www.youtube.com/watch?v=U2ppEzBaMck
     * Longest substring with k distinct characters
     * -------------------------------------------------------------
     * Count Substrings With Exactly K Distinct Characters
     * Trick:
     *
     * countExactlyK = countAtMostK(k) - countAtMostK(k - 1)
     * ---------------------------------------------------------------
     * Count Substrings With At Most K Distinct Characters
     * Constraint: Count total substrings, not just longest.
     * Example:
     * s = "abc", k = 2
     * Substrings = "a","b","c","ab","bc"
     * Count = 5
     * -----------------------------------------------------------
     * Smallest Substring Containing All Unique Characters
     * Example:
     * s = "aabcbcdbca"
     * Unique chars = {a,b,c,d}
     * Output → "dbca" (length 4)
     * -------------------------------------------------------------
     * Smallest Substring With K Distinct Characters
     * Constraint: Find the minimum-length substring containing k distinct chars.
     * Example:
     * s = "aabcbcdbca", k = 3
     * Output → "bca"
     * ------------------------------------------------------------
     * Longest Substring With Exactly K Distinct Characters
     * Constraint: Substring must contain exactly k distinct characters.
     * Example:
     * s = "aabacbebebe", k = 3
     * Output → "cbebebe" (length 7, unique = {c, b, e})
     * --------------------------------------------------------
     * Longest Substring With At Most K Distinct Characters
     * Constraint: Substring can have ≤ k distinct characters.
     * Example:
     * s = "eceba", k = 2
     * Output → "ece" (length 3)
     *----------------------------------------------------------
     * Longest Substring Without Repeating Characters
     *
     * Constraint: All characters must be unique.
     * Example:
     * s = "abcabcbb"
     * Output → "abc" (length 3)
     * ----------------------------------------------------------
     * Identify Sliding window capability
     * Fruits into baskets
     * Minimum size subarray sum
     * Maximum Consecutive Ones
     * Components of Sliding Window
     * Identify sliding window opportunity
     */
}
