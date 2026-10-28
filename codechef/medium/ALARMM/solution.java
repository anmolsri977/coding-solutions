import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            String s = input.next();

            int total = 0;
            int current = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1' && i >= current) {
                    total++;
                    current = i + k + 1;
                }
            }

            System.out.println(total);
        }

	}
}
