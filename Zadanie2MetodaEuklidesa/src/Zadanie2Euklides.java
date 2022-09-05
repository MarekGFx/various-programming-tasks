import java.util.ArrayList;

public class Zadanie2Euklides {

    public static ArrayList<Long> findNPerfectNumbers(long n){
        ArrayList<Long> perfectNumList = new ArrayList<>();

        long x = 0;
        long primeNumber;
        long perfectNumber;

        while (perfectNumList.size() != n){

            primeNumber = (long) Math.pow(2,x) - 1;

            int count = 0;
            float squareOfX = (float) Math.sqrt(primeNumber);
            long roundedSquareNumberToCheck = Math.round(squareOfX);

            for (long i = 2; i <= roundedSquareNumberToCheck; i++) {
                if(primeNumber % i == 0){
                    count++;
                }
            }

            if (count==0 && primeNumber > 1) {
                perfectNumber = (long) (primeNumber * Math.pow(2,x-1));
                perfectNumList.add(perfectNumber);
            }
            x++;
        }
        return perfectNumList;
    }

    public static void main(String[] args) {
        System.out.println(findNPerfectNumbers(7));
    }
}
