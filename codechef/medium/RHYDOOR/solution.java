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
            String S = sc.next();

            int count = 0;
            int streak = 0;
            char prev = ' ';

            for (int i = 0; i < N; i++) {
                char curr = S.charAt(i);

                if (curr == prev) {
                    streak++;
                } else {
                    prev = curr;
                    streak = 1;
                }

                if (streak == 3) {
                    count++;
                    streak = 0;
                    prev = ' ';
                }
            }

            System.out.println(count);
        }


	}
}
