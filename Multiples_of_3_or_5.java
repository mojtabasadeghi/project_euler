import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 *The sum of these multiples is 23.Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Multiples_of_3_or_5 {
    public static void main(String[] args) {
        List<Integer> lst =new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            if (i%3 == 0) {
                lst.add(i);
                continue;
            }
            if (i%5==0){
                lst.add(i);
                continue;
            }
        }

        AtomicInteger sum= new AtomicInteger();
        System.out.println("The list of value is as follow: ");
        lst.forEach(x-> {
            System.out.print(x + ", ");
            sum.addAndGet(x);
        });

        System.out.println("\nThe sum value is: "+sum);
    }
}
