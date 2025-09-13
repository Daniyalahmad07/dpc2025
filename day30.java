/*The Coin Change Problem

You are given an integer array coins[] of size n, where each element represents the denomination of a coin. You are also given an integer amount, representing the total amount of money. The task is to find the minimum number of coins required to make up the given amount.
If the amount cannot be formed by any combination of the coins, return -1.
You can assume that you have an infinite supply of each denomination.
*/
public class CoinChange {
    public static int minCoinReq(int[] coins, int amt) {
        int n = amt + 1;
        int[] minCoins = new int[n];
        minCoins[0] = 0;
        for (int i = 1; i < n; i++) {
            minCoins[i] = n;
        }

        for (int c : coins) {
            for (int i = c; i <= amt; i++) {
                int temp = minCoins[i - c] + 1;
                if (temp < minCoins[i]) {
                    minCoins[i] = temp;
                }
            }
        }
        if (minCoins[amt] == n) {
            return -1;
        }
        return minCoins[amt];
    }

    public static void main(String[] args) {
        int[] test1 = { 1, 2, 5 };
        int amt = 11;
        System.out.println(minCoinReq(test1, amt));
    }
}
