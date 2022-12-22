public class Largest_prime_factor_ai {
    public static void main(String[] args) {
        long num = 600851475143L;
        long largestFactor = 0;

        // Divide by 2 until num is odd
        while (num % 2 == 0) {
            largestFactor = 2;
            num /= 2;
        }

        // num is now odd, so we can skip even numbers
        for (long i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largestFactor = i;
                num /= i;
            }
        }

        // The remaining num is either 1 or a prime greater than 2
        if (num > 2) {
            largestFactor = num;
        }

        System.out.println("The largest prime factor is: " + largestFactor);
    }
}