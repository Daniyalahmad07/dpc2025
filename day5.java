/*You are given an integer array arr of size n. An element is considered a leader if it is greater than all the elements to its right. Your task is to find all such leader elements in the array.

Constraints:
1 ≤ n ≤ 10^6
1 ≤ arr[i] ≤ 10^9

*/

import java.util.*;

public class day5 {

    public static int[] findLeaders(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            return new int[] {};
        }
        List<Integer> leaders = new ArrayList<>();

        int currMax = arr[n - 1];
        leaders.add(currMax);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= currMax) {
                leaders.add(arr[i]);
                currMax = arr[i];
            }
        }
        int leaderSize = leaders.size();
        int[] leaderArray = new int[leaderSize];
        for (int i = 0; i < leaderSize; i++) {
            leaderArray[leaderSize - i - 1] = leaders.get(i);
        }
        return leaderArray;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int[] leaders = findLeaders(arr);
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Leaders: " + Arrays.toString(leaders));

    }
}
