/*Sliding Window Maximum

You are given an array of integers arr and a positive integer k. Your task is to find the maximum element in each sliding window of size k. The window slides from left to right, one element at a time, and you need to return the maximum element for each of these windows.
Edge Cases:
Single Element Array: The array contains only one element
Window Size 1: The window size is 1, so each element is its own maximum
Array with All Same Elements: If all elements in the array are the same, the maximum for every window will be the same element
*/
import java.util.ArrayDeque;
import java.util.Deque;

public class day23 {

    public static int[] findMaxArray(int[] arr, int k) {
        int[] maxArr = new int[arr.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                maxArr[i - k + 1] = arr[dq.peekFirst()];
            }
        }
        return maxArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = findMaxArray(arr, k);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
