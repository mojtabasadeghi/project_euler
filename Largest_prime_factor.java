import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *The prime factors of 13195 are 5, 7, 13 and 29.
 *What is the largest prime factor of the number 600851475143 ?
 */
public class Largest_prime_factor {
    final static long Final_Value = 600851475143L;
    public static void main(String[] args) {
        System.out.println("Largest prime number is: " +largestPrimeNumber(Final_Value));
    }

    public static boolean is_prime(long n)
    {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }

    public static long largestPrimeNumber (long value )
    {
        System.out.println("Creating Prime Numbers List....");
        long i=1L;
        long largestPrimeFactor=0;
        while (i<Final_Value)
        {
            if (is_prime(i)) {
                if (Final_Value%i==0 && i>largestPrimeFactor)
                    largestPrimeFactor=i;
            }
            if(i== Final_Value/10)
                System.out.println("10% process done...");
            if(i== Final_Value/5)
                System.out.println("20% process done...");
            if(i== Math.round(Final_Value/3.33))
                System.out.println("30% process done...");
            if(i== Math.round(Final_Value/2.5))
                System.out.println("40% process done...");
            if(i== Final_Value/2)
                System.out.println("50% process done...");
            if(i== Math.round(Final_Value/1.67))
                System.out.println("60% process done...");
            if(i== Math.round(Final_Value/1.43))
                System.out.println("70% process done...");
            if(i== Math.round(Final_Value/1.25))
                System.out.println("80% process done...");
            if(i== Math.round(Final_Value/1.11))
                System.out.println("90% process done...");

            i++;
        }
        System.out.println("100% process done.");
        return largestPrimeFactor;
    }
}


/**This is another better solution for this problem. I found it on
 * https://stackoverflow.com/a/30628432
 *
 *     public static void main(String[] args) {
 *         long testNum = 600851475143ll;
 *         int largestFactor = 0;
 *         long loopMax = 17425170l; //largest known prime
 *         for (int i = 3; i * i <= loopMax; i++) {
 *             boolean isPrime = true;
 *             for (int j = 2; j < i; j++) {
 *                 if (i % j == 0) {
 *                     isPrime = false;
 *                     break;
 *                 }
 *             }
 *             if (isPrime && testNum % i == 0) {
 *                 System.out.println("prime factor: " + i);
 *                 largestFactor = i;
 *                 loopMax = (testNum / i) + 1;
 *             }
 *         }
 *         System.out.println("result is: " + largestFactor);
 *     }
 */