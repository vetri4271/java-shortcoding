/*Question 4: Coin Sum Combinations

Given:

A = number of 1-rupee coins
B = number of 2-rupee coins
C = number of 5-rupee coins

Find the number of ways you can pick coins such that the total sum of the selected coins is equal to the given target T.

Example

Input:

A = 3, B = 2, C = 1, T = 5

Output:

3

Explanation:

Given:

A: 3 one-rupee coins
B: 2 two-rupee coins
C: 1 five-rupee coin

The ways to obtain a sum of 5 are:

3 one-rupee coins + 1 two-rupee coin
1 one-rupee coin + 2 two-rupee coins
1 five-rupee coin*/

public class CoinSum {

    public static void main(String[] args) {

        int A = 3;
        int B = 2;
        int C = 1;
        int T = 5;

        int count = 0;

        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {

                int remaining = T - (i + 2 * j);

                if (remaining >= 0 && remaining % 5 == 0) {
                    int k = remaining / 5;

                    if (k <= C) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}