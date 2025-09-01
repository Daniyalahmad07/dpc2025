/*Count the Number of Divisors of a Number

Given a positive integer N, your task is to find the total number of divisors (factors) of N. A divisor of N is any integer that divides N without leaving a remainder.
A divisor of a number is any integer that divides the number evenly (i.e., without a remainder). For example, for N = 12, its divisors are 1, 2, 3, 4, 6, 12, so the total number of divisors is 6
Edge Cases:
N is 1: The only divisor of 1 is itself, so the output should be 1.
N is a prime number: If N is prime, the divisors are 1 and N itself, so the output should be 2.
N is a perfect square: For numbers like 36, where the square root (6) appears as a divisor, ensure that it is counted only once.
N is very large: Ensure the algorithm efficiently handles large numbers up to 109*/
public class day18 {

    public static int findFactor(int n){
    
        int count=0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count++;
                } else {
                    count += 2;
                }}
        }
        return count;
    }
    public static void main(String args[]){
        int n=18;
        System.out.println(findFactor(n));
    }
}
