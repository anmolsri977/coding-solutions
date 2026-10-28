import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long ans = a[n - 1] - a[0];

            if (n == 2) {
                System.out.println(ans);
                continue;
            }

            ans = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                long value = a[i];

                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        value = Math.max(value, a[j] - a[i]);
                    }
                }

                ans = Math.max(ans, value);
            }

            System.out.println(ans);
        }

	}
}
