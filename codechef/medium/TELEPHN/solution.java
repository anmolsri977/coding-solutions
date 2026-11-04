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
            int mx = 0;

            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                mx = Math.max(mx, a[i]);
            }

            int[][] dist = new int[2][n];

            for(int i = 0; i < 2; i++)
                Arrays.fill(dist[i], -1);

            Queue<Integer> q = new LinkedList<>();

            // Start BFS from all maximum elements
            for(int i = 0; i < n; i++)
            {
                if(a[i] == mx)
                {
                    dist[0][i] = 0;
                    q.add(i);
                }
            }

            // BFS
            while(!q.isEmpty())
            {
                int node = q.poll();

                int parity = node / n;
                int i = node % n;

                int nextParity = 1 - parity;

                int left = (i - 1 + n) % n;
                int right = (i + 1) % n;

                if(dist[nextParity][left] == -1)
                {
                    dist[nextParity][left] = dist[parity][i] + 1;
                    q.add(nextParity * n + left);
                }

                if(dist[nextParity][right] == -1)
                {
                    dist[nextParity][right] = dist[parity][i] + 1;
                    q.add(nextParity * n + right);
                }
            }

            int maxEven = 0;
            int maxOdd = 0;

            boolean evenValid = true;
            boolean oddValid = true;

            for(int i = 0; i < n; i++)
            {
                if(dist[0][i] == -1)
                    evenValid = false;
                else
                    maxEven = Math.max(maxEven, dist[0][i]);

                if(dist[1][i] == -1)
                    oddValid = false;
                else
                    maxOdd = Math.max(maxOdd, dist[1][i]);
            }

            int ans = Integer.MAX_VALUE;

            if(evenValid)
                ans = Math.min(ans, maxEven);

            if(oddValid)
                ans = Math.min(ans, maxOdd);

            if(ans == Integer.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(ans);
        }
    }
}