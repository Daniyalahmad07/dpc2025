/*You are given a string s. Your task is to generate and return all possible permutations of the characters in the string. A permutation is a rearrangement of the characters in the string, and each character must appear exactly once in every permutation. If there are duplicate characters in the string, the resulting permutations should also be unique (i.e., no repeated permutations).
Constraints:
1 ≤ s.length ≤ 9
The string s consists of lowercase English letters.
If s contains duplicate letters, the permutations must be unique.
*/
public class day11 {
    public static void permute(char[] arr, int l, int r) {
        if (l == r) {
            for (int i = 0; i <= r; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }

        for (int i = l; i <= r; i++) {
            if (shouldSwap(arr, l, i)) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i);
            }
        }
    }

    private static boolean shouldSwap(char[] arr, int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (arr[i] == arr[curr]) {
                return false;
            }
        }
        return true;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s = "aab";
        char[] arr = s.toCharArray();
        permute(arr, 0, arr.length - 1);
    }
}
