
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Largest_palindrome_product {
    public static void main(String[] args) {

        List<Integer> outPut = new ArrayList<>();
        int temp = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                temp = i*j;
                if ( String.valueOf(temp).equals(str_reverce(String.valueOf(temp))) && String.valueOf(temp).length()>5)
                {
                    outPut.add(temp);
                }
            }
        }

        int biggestNum=0;
        for (int w = 0; w < outPut.size() ; w++) {
            if (biggestNum<outPut.get(w))
                biggestNum = outPut.get(w);
        }

      //  outPut.sort(Comparator.naturalOrder()); //or   = outPut.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(biggestNum);
        System.out.println(outPut);
    }
    public static String str_reverce(String str)
    {
        String strRev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            strRev += str.charAt(i);
        }
        return  strRev;
    }
}
