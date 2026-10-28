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
                if (a[i] == a[i + 1]) {
                    score++;
                }
            }

            int best = score;
            int maxGain = 0;

            for (int l = 0; l < n; l++) {
                int gain = 0;

                if (l > 0) {
                    if (a[l - 1] == a[l] + 1) gain++;
                    if (a[l - 1] == a[l]) gain--;
                }

                maxGain = Math.max(maxGain, gain);

                for (int r = l; r < n; r++) {
                    int current = score;

                    if (l > 0) {
                        if (a[l - 1] == a[l]) current--;
                        if (a[l - 1] == a[l] + 1) current++;
                    }

                    if (r < n - 1) {
                        if (a[r] == a[r + 1]) current--;
                        if (a[r] + 1 == a[r + 1]) current++;
                    }

                    best = Math.max(best, current);
                }
            }

            System.out.println(best);
        }

	}
}
