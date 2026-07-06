/*Question 1
 Pattern generation without arrays
 1
 6 2
 10 7 3
 13 11 8 4
 15 14 12 9 5*/
public class Pattern1 {
    public static void main(String[] args) {

        int n = 5;
        int first = 1;

        for (int i = 1; i <= n; i++) {

            int p = first;
            int d = n - i + 1;

            System.out.print(p + " ");

            for (int j = 2; j <= i; j++) {
                p = p - d;
                System.out.print(p + " ");
                d++;
            }

            System.out.println();

            first += (n - i + 1);
        }
    }
}