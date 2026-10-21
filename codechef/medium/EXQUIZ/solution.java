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
            int S = sc.nextInt();

            int correct = (S + 3) / 4;
            int attempts = 5 * correct - S;

            if (attempts <= N) {
                System.out.println(attempts);
            } else {
                System.out.println(-1);
            }
        }

	}
}
