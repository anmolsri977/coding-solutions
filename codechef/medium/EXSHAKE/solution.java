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
            long M = sc.nextLong();

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            long low = 0, high = 20000, K = 0;

            while (low <= high) {
                long mid = (low + high) / 2;
                long handshakes = mid * (mid - 1) / 2;

                if (handshakes <= M) {
                    K = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            Arrays.sort(A);

            long sum = 0;
            int groups = 0;

            for (int x : A) {
                if (sum + x <= K) {
                    sum += x;
                    groups++;
                } else {
                    break;
                }
            }

            System.out.println(groups);
        }


	}
}
