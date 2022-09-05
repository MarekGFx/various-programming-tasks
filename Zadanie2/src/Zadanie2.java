import java.util.ArrayList;

public class Zadanie2 {

    public static ArrayList<Integer> findNPerfectNumbers(int n){
        ArrayList<Integer> perfectNumList = new ArrayList<>();
            int perfectNumber = 0;
            while (perfectNumList.size() != n){

                int sum = 1;
                double squareOfPerfectNum =  Math.sqrt(perfectNumber);
                int roundedSquare = (int) Math.round(squareOfPerfectNum);

                for (int i = 2; i <= roundedSquare; i++) {
                    if (perfectNumber % i == 0){

                        if(i*i==perfectNumber)
                            sum+=i;
                        else
                            sum=sum + i + perfectNumber/i;
                    }
                }
                if (sum == perfectNumber && perfectNumber > 1) {
                    perfectNumList.add(perfectNumber);
                }
                perfectNumber++;
            }
            return perfectNumList;
    }

    public static void main(String[] args) {
        System.out.println(findNPerfectNumbers(4));
    }

}
