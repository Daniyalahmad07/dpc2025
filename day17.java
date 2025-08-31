/*Prime Factorization of a Number

Given a positive integer N, your task is to find its prime factorization. Return a list of prime numbers that multiply together to give N. If N is prime, the output should be a list containing only N.
Prime factorization is the process of breaking down a number into the set of prime numbers that, when multiplied together, result in the original number. For example, if N = 18, its prime factors are [2, 3, 3] because 2×3×3=18.

Edge Cases:
N is a small prime number: If N is prime (e.g., 2, 3, 5, 7), the list should only contain N.
N is a perfect power of a prime: For N = 27, the result should be [3, 3, 3].
N has large prime factors: Ensure the algorithm can handle prime factors larger than the square root of N

*/
import java.util.ArrayList;

public class day17{

    public static ArrayList<Integer> findprimefactor(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                arr.add(i);
                n=n/i;
                
            }
        }
        if (n > 1) arr.add(n); 
        return arr;
    }
    public static void main(String args[]){
        int n=18;
        System.out.println(findprimefactor(n));
        n=30;
        System.out.println(findprimefactor(n));
        n=49;
        System.out.println(findprimefactor(n));
        n=64;
        System.out.println(findprimefactor(n));
    }
}
