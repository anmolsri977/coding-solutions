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
            String a = sc.next();
            String b = sc.next();

            int c1 = 0, c2 = 0;

            for (char ch : a.toCharArray()) {
                if (ch == '1') c1++;
            }

           for (char ch : b.toCharArray()) {
                if (ch == '1') c2++;
            }

            if ((c1 % 2) == (c2 % 2))
            System.out.println("YES");
            else
            System.out.println("NO");
            }

	}
}
