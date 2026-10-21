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
            int M = sc.nextInt();

            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A);

            int people = 0;
            int groups = 0;

            for (int i = 0; i < N; i++) {
                people += A[i];

                long handshakes = (long) people * (people - 1) / 2;

                if (handshakes <= M) {
                    groups++;
                } else {
                    break;
                }
            }

            System.out.println(groups);
        }


	}
}
