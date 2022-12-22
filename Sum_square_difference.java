/**
 * The sum of the squares of the first ten natural numbers is: 385
 * The square of the sum of the first ten natural numbers is: 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is: 3025 - 385= 2640
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Sum_square_difference {
    public static void main(String[] args) {
        final int NUMBER_OF_NATURAL=100;
        System.out.println("The difference between the sum of the squares of the first" +
                " one hundred natural numbers and the square of the sum is: "+(squre_of_sum(NUMBER_OF_NATURAL) - sum_of_squre(NUMBER_OF_NATURAL)));
    }

    public static long sum_of_squre(int leesThanThis)
    {
        long res=0;
        for (int i = 1; i <= leesThanThis; i++) {
            res +=(long) Math.pow(i,2);
        }
        return res;
    }

    public static long squre_of_sum(int lessThanThis)
    {
        long res=0;
        for (int i = 1; i <= lessThanThis ; i++) {
            res+=i;
        }
        return (long)  Math.pow(res,2);
    }
}
