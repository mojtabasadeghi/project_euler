/**
 *By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class The_10001st_prime {
    public static void main(String[] args) {
        final  int TH_PRIMENUMBER = 10001;
        int counter = 2;
        long i=0,prime=2;
        while (i < Long.MAX_VALUE )
        {
            if (isPrime(i))
            {
                counter++;
                prime=i;
            }
            if(counter == TH_PRIMENUMBER)
            {
                break;
            }
            i++;
        }
        System.out.println("The "+ TH_PRIMENUMBER +" Prime Number is: "+ prime);
    }
    public static boolean isPrime(long n)
    {
        if (n<2)
            return false;
        if (n % 2 == 0)
            return false;
        if (n % 3 ==0)
            return false;
        int i=5;
        while ( i < Math.floor(1 + Math.sqrt(n)))
        {
            if (n % i == 0 )
                return false;
            if (n % (i+2) == 0)
                return false;
            i+=6;
        }
        return true;
    }
}
