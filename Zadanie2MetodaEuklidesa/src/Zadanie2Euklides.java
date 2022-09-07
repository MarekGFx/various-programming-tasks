import java.math.BigInteger;
import java.util.ArrayList;

public class Zadanie2Euklides {

    public static ArrayList<BigInteger> findNBig(long n){
        ArrayList<BigInteger> perfectNumList = new ArrayList<>();

        int x = 1;
        BigInteger primeNumber ;
        BigInteger tempPrimeNumber = BigInteger.valueOf(2);
        BigInteger squareOfPrimeN;
        BigInteger perfectNumber;

        while (perfectNumList.size() !=n  ) {

            primeNumber = tempPrimeNumber.pow(x).subtract(BigInteger.ONE);
            int count = 0;
            squareOfPrimeN = primeNumber.sqrt();
            for (BigInteger i = BigInteger.TWO; i.compareTo(squareOfPrimeN) <= 0; i = i.add(BigInteger.ONE)) {
                if (primeNumber.mod(i).compareTo(BigInteger.valueOf(0)) == 0) {
                    count++;
                }
            }
            if (count == 0 && primeNumber.compareTo(BigInteger.valueOf(1)) > 0) {
                perfectNumber = primeNumber.multiply(new BigInteger("2").pow(x - 1));
                perfectNumList.add(perfectNumber);
            }
            x++;
        }
        return perfectNumList;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(findNBig(9));
        long end = System.currentTimeMillis();

        float result = (end - start)/1000F;

        System.out.println("Total execution time: " + result + " seconds");
    }
}
