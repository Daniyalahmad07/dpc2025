/*You are given an array arr containing n+1 integers, where each integer is in the range [1, n] inclusive. There is exactly one duplicate number in the array, but it may appear more than once. Your task is to find the duplicate number without modifying the array and using constant extra space.

Input:
An integer array arr of size n+1, where each element is an integer in the range [1, n].
Example : arr = [3, 1, 3, 4, 2]

Output:
Return the duplicate integer present in the array.
Example: Duplicate number: 3

Constraints:
1 ≤ n ≤ 10^5.
There is only one duplicate number, but it may appear more than once.
You must not modify the array (arr) or use extra space greater than O(1).
The time complexity must be O(n).*/

public class day3 {

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        int nums[]={3, 1, 3, 4, 2};
        System.out.print(findDuplicate(nums));
    }
}


