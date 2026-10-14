import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static long solve(long n) {
        long sum = 0;

        long l = 1;

        while (l <= n) {
            long q = n / l;
            long r = n / q;

            sum += q * (r - l + 1);

            l = r + 1;
        }

        return sum - n;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(solve(n));
        }
    }
}