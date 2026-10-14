import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt(); 

            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {

                    int merged = A[i] + A[j];

                    int curMax = merged;

                    for (int k = 0; k < N; k++) {
                        if (k != i && k != j) {
                            curMax = Math.max(curMax, A[k]);
                        }
                    }

                    ans = Math.min(ans, curMax);
                }
            }

            System.out.println(ans);
        }

	}
}
