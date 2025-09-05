/*First Element to Repeat k Times

You are given an array of integers and an integer k. Your task is to find the first element in the array that appears exactly k times. If no such element exists, return -1.

*/
import java.util.*;
public class day22 {
    public static int firstElementKTimes(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (freq.get(num) == k) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k1 = 2;
        System.out.println(firstElementKTimes(arr1, k1));

        int[] arr2 = {2, 3, 4, 2, 2, 5, 5};
        int k2 = 2;
        System.out.println(firstElementKTimes(arr2, k2));
    }
}
