/*LCM (Least Common Multiple) of Two Numbers

You are given two integers, N and M. Your task is to find the Least Common Multiple (LCM) of these two numbers. The LCM of two integers is the smallest positive integer that is divisible by both N and M.
Edge Cases:
One number is 1: The LCM of any number with 1 is the number itself.
Both numbers are equal: If N == M, then LCM is N (or M).
Large numbers: Handle large inputs efficiently using the Euclidean algorithm for computing GCD.
*/
import java.util.*;
public class day16 {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        System.out.println(lcm(num1, num2));
    }
}
