/*
Count Substrings with Exactly K Distinct Characters

You are given a string s of lowercase English alphabets and an integer k. Your task is to count all possible substrings of s that contain exactly k distinct characters.

Constraints:
A string s consisting of lowercase English letters.
An integer k, where 1 ≤ 𝑘 ≤ 26
The length of the string satisfies 1 ≤ 𝑛 ≤ 104
*/
import java.util.*;

public class day14 {
    private static int atMostK(String s, int k) {
        int n = s.length();
        int left = 0, count = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }

    public static int exactlyK(String s, int k) {
        if (k > s.length()) return 0;
        return atMostK(s, k) - atMostK(s, k - 1);
    }

    public static void main(String[] args) {
        System.out.println(exactlyK("pqpqs", 2));
        System.out.println(exactlyK("aabacbebebe", 3));
        System.out.println(exactlyK("a", 1));
        System.out.println(exactlyK("abc", 3));
        System.out.println(exactlyK("abc", 2));
    }
}
