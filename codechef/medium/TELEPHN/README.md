# TELEPHN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Telephone

$N$ friends are sitting around a round table, playing a game of Telephone. Friend $i$ starts with the number $A_i$.
The friends are numbered $1$ to $N$ in clockwise order, so friend $i$ sits between friends $i-1$ and $i+1$; friend $1$ sits between friends $N$ and $2$.

Every second, all the friends call out their numbers at the same time. Each friend hears only the two friends sitting next to them, forgets their own number, and takes the  **larger**  of the two numbers they heard.

Formally, every second, $A_i$ is replaced by $\max(A_{i-1}, A_{i+1})$, where indices are taken cyclically.
This happens for all $1 \le i \le N$  **simultaneously**.

Find the  **minimum**  number of seconds after which all the friends hold the same number, or report that this never happens.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the number of friends. The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — the starting numbers of the friends.
### Output Format

For each test case, output on a new line the minimum number of seconds after which all the friends hold the same number, or $-1$ if this never happens.

### Constraints
- $1 \leq T \leq 10^5$
- $3 \leq N \leq 2 \cdot 10^5$
- $1 \leq A_i \leq 10^9$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
4
6
3 8 2 8 6 1
5
4 2 7 3 5
8
6 9 4 1 7 3 9 2
7
5 9 2 6 9 1 4

```

```
-1
4
3
4

```

### Explanation:

 **Test case 1:**  It can be verified that the numbers will never be all equal.

 **Test case 2:**  The numbers change as follows: $[4, 2, 7, 3, 5] \to [5, 7, 3, 7, 4] \to [7, 5, 7, 4, 7] \to [7, 7, 5, 7, 7] \to [7, 7, 7, 7, 7]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T16:26:48.343Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/TELEPHN)