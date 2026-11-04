import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long d = sc.nextLong();

            long g = gcd(x, y);

            long limit = y / g;
            long ans = Long.MAX_VALUE;

            for(long k = 1; k <= limit; k++)
            {
                long time = k * x;

                long rem = time % y;

                if(rem <= d)
                {
                    ans = Math.min(ans, time);
                }

                if(y - rem <= d)
                {
                    ans = Math.min(ans, time + (y - rem));
                }
            }

            System.out.println(ans);
        }
    }

    static long gcd(long a, long b)
    {
        while(b != 0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}