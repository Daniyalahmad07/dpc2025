/*Sliding Window Maximum

You are given an array of integers arr and a positive integer k. Your task is to find the maximum element in each sliding window of size k. The window slides from left to right, one element at a time, and you need to return the maximum element for each of these windows.
Edge Cases:
Single Element Array: The array contains only one element
Window Size 1: The window size is 1, so each element is its own maximum
Array with All Same Elements: If all elements in the array are the same, the maximum for every window will be the same element
*/
public class day23 {
    private static int findCurrMax(int[] arr, int start, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < start + k; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int[] findMaxArray(int[] arr, int k) {
        int[] maxArr = new int[arr.length - k + 1];
        maxArr[0] = findCurrMax(arr, 0, k);
        for (int i = k; i < arr.length; i++) {
            int pointer = i - k;
            int currMax = maxArr[pointer];
            if (currMax < arr[i]) {
                currMax = arr[i];
            } else if (currMax <= arr[pointer]) {
                currMax = findCurrMax(arr, pointer + 1, k);
            }
            maxArr[pointer + 1] = currMax;
        }
        return maxArr;
    }
}
