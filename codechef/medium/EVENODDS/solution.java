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
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }

            int maxLen = 0;

            for(int i = 0; i < n; i++)
            {
                int odd = 0;

                for(int j = i; j < n; j++)
                {
                    if(a[j] % 2 != 0)
                    {
                        odd++;
                    }

                    if(odd % 2 == 0)
                    {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }

            System.out.println(maxLen);
        }
    }
}