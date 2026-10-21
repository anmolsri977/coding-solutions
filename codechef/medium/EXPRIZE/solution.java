import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean possible(long k, long n) {
        return k * (k * k + 5) / 6 <= n;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();

            long low = 1, high = 2_000_000L, ans = 1;

            while (low <= high) {
                long mid = (low + high) / 2;

                if (possible(mid, N)) {
                    ans = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            System.out.println(ans);
        }

	}
}
