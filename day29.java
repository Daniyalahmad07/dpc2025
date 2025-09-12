/*Fibonacci Sequence using Dynamic Programming

You are given an integer n. Your task is to calculate the n-th Fibonacci number using Dynamic Programming.
The Fibonacci sequence is a series of numbers where:
F(0)=0
F(1)=1
For n≥2, F(n)=F(n−1)+F(n−2)
Your task is to compute F(n) efficiently by using a bottom-up dynamic programming approach, avoiding redundant calculations.
*/

import java.math.BigInteger;

public class FibonacciSequence {

    // bottom-up, tabulation
    public static BigInteger findFibonacciDP(int n) {
        BigInteger f0 = BigInteger.ZERO;
        BigInteger f1 = BigInteger.ONE;
        if (n == 0)
            return f0;
        for (int i = 2; i <= n; i++) {
            BigInteger temp = f0.add(f1);
            f0 = f1;
            f1 = temp;
        }
        return f1;
    }

    public static void main(String[] args) {
        int[] testCases = { 5, 10, 0, 1000 };
        for (int n : testCases) {
            System.out.println("N = " + n + " -> Fibonacci Sequence = " + findFibonacciDP(n));
        }
    }
}
