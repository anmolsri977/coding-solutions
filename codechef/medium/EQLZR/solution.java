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
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int score = 0;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1]) score++;
            }

            int[] best = new int[n + 1];
            int ans = score;

            for (int i = 1; i < n; i++) {
                int gain = 0;

                if (a[i - 1] == a[i] + 1) gain++;
                if (a[i - 1] == a[i]) gain--;

                best[i] = Math.max(best[i - 1], gain);
            }

            int suffix = 0;

            for (int r = n - 1; r >= 0; r--) {
                int rightGain = 0;

                if (r < n - 1) {
                    if (a[r] + 1 == a[r + 1]) rightGain++;
                    if (a[r] == a[r + 1]) rightGain--;
                }

                ans = Math.max(ans, score + rightGain + (r > 0 ? best[r] : 0));
            }

            System.out.println(ans);
        }


	}
}
