public class Zadanie1 {

    public static String createPicture(int n){
        StringBuilder result = new StringBuilder();
        int size = 2 * n - 1;
        int k;

        for (int i = 1; i <= size; i++) {
            k = n;
            if (i <= n) {
                for (int j = 1; j <= size; j++) {
                    result.append(String.format("%-2d", k));
                    if (i > j)
                        k--;
                    if ((i + j) > size)
                        k++;
                }
                result.append("\n");
            } else if (i > n){
                for (int j = 1; j <= size; j++) {
                    result.append(String.format("%-2d", k));
                    if((i+j)<(size+1))
                        k--;
                    if(i<=j)
                        k++;
                }
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(createPicture(3));
    }
}

