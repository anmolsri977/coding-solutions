import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int x = 0, y = 0;
            
            for (char ch : s.toCharArray()) {
                if (ch == 'U') y++;
                else if (ch == 'D') y--;
                else if (ch == 'R') x++;
                else x--;
            }
            if ((Math.abs(x) == 2 && y == 0) ||(Math.abs(y) == 2 && x == 0))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

	}
}
