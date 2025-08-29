/*Find the Longest Substring Without Repeating Characters

You are given a string S, and your task is to find the length of the longest substring that contains no repeating characters. A substring is a contiguous block of characters in the string.
In this problem, you need to find the length of the longest substring where all the characters are unique. The substring can be formed by starting at any position in the string, but it must not contain any repeated characters.

Edge Cases:
Single character string: The longest substring without repeating characters is the character itself.
All characters are unique: If no characters repeat, the entire string is the longest substring.
All characters are the same: If all characters are identical, the longest substring will be of length 1.
*/
import java.util.*;

public class day15 {
    public static int LongestUniqueSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            if (freq.get(c) == 2) {
                stack.push(c);
                while (freq.get(c) > 1) {
                    char leftChar = s.charAt(left);
                    freq.put(leftChar, freq.get(leftChar) - 1);
                    left++;
                }
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(LongestUniqueSubstring(s));
    }
}
