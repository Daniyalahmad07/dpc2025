/*
Longest Common Prefix

You are given an array of strings strs[], consisting of lowercase letters. Your task is to find the longest common prefix shared among all the strings. If there is no common prefix, return an empty string "".
A common prefix is a substring that appears at the beginning of all the strings in the array. The task is to identify the longest such prefix that all strings share.
Constraints:
1 ≤ strs.length ≤ 200 (The array can contain up to 200 strings)
0 ≤ strs[i].length ≤ 200 (Each string can be up to 200 characters long)
All strings in strs[] consist of lowercase English letters.
*/
public class day9 {
    public static void printLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            System.out.println("");
            return;
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }
        System.out.println(prefix);
    }

    public static void main(String[] args) {
        printLongestCommonPrefix(new String[]{"flower", "flow", "flight"});
        printLongestCommonPrefix(new String[]{"dog", "racecar", "car"});
        printLongestCommonPrefix(new String[]{"apple", "ape", "april"});
        printLongestCommonPrefix(new String[]{""});
        printLongestCommonPrefix(new String[]{"alone"});
    }
}

    

