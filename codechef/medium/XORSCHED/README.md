# XORSCHED

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Xor Scheduler

 *As always, Hyder seeks Order in Chaos. This time, the CPU is flooded with processes whose arrival times and execution durations are scrambled by chaos. Help him do a few calculations!* 

There are $N+1$ processes indexed from $0$ to $N$. You are given two integers $X$ and $Y$.

For each process $i$, where $0 \le i \le N$:

- Its arrival time is $i \oplus X$.
- Its runtime is $(i \oplus Y) + 1$.

Here, $\oplus$ denotes the bitwise XOR operation.

There is one CPU, available from time $0$.
The CPU will perform the operations in a first-come, first-served manner - that is, whenever the CPU becomes free and there are waiting processes, it executes the waiting process with the earliest arrival time.
Once a process starts executing, it continues until completion.
If no process is waiting, the CPU remains idle until the next process arrives.

The CPU can start a new task in the same instant that an older task finishes.

Determine the time at which all the processes have finished executing.

### Input Format
- The first line of input contains a single integer $T$, the number of test cases.
- Each test case consists of a single line containing three space-separated integers $X$, $Y$ and $N$.
### Output Format

For each test case, print a single integer: the time at which all the processes have finished executing.

### Constraints
- $1 \le T \le 10^4$
- $0 \le X, Y, N \lt 2^{30}$
### Sample 1:
Input
Output

```
4
0 0 0
1 2 3
6 2 2
585652603 764651540 577238819

```

```
1
10
13
441459496525093482
```

### Explanation:

 **Test case $1$:**  Process $0$ arrives at time $0$ and has runtime $1$, so it finishes at time $1$.

 **Test case $2$:**  The arrival times of processes $0, 1, 2, 3$ are $1, 0, 3, 2$ and their runtimes are $3, 4, 1, 2$ respectively.
The CPU executes process $1$ during $[0, 4]$, process $0$ during $[4, 7]$, process $3$ during $[7, 9]$ and process $2$ during $[9, 10]$.

 **Test case $3$:**  The arrival times of processes $0, 1, 2$ are $6, 7, 4$ and their runtimes are $3, 4, 1$ respectively.
The CPU is idle until time $4$, executes process $2$ during $[4, 5]$, is idle again until time $6$, then executes process $0$ during $[6, 9]$ and process $1$ during $[9, 13]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T16:29:02.561Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	 static long x, z, n;

    static class Result {
        long sum, best;

        Result(long sum, long best) {
            this.sum = sum;
            this.best = best;
        }
    }

    static Result full(long prefix, int b) {
        long count = 1L << b;
        long base = prefix << b;
        long high = (prefix ^ (z >> b)) << b;
        long sum = count * high + count * (count - 1) / 2 + count;
        return new Result(sum, base + sum);
    }

    static Result merge(Result a, Result b) {
        if (a.best == Long.MIN_VALUE) return b;
        if (b.best == Long.MIN_VALUE) return a;

        return new Result(
            a.sum + b.sum,
            Math.max(a.best + b.sum, b.best)
        );
    }

    static Result solve(int bit, long prefix, int cmp) {
        if (cmp < 0) return full(prefix, bit + 1);
        if (cmp > 0) return new Result(0, Long.MIN_VALUE);

        if (bit < 0) {
            long w = (prefix ^ z) + 1;
            return new Result(w, prefix + w);
        }

        int xb = (int)((x >> bit) & 1);
        int nb = (int)((n >> bit) & 1);

        Result left = child(bit, prefix, 0, xb, nb, cmp);
        Result right = child(bit, prefix, 1, xb, nb, cmp);

        return merge(left, right);
    }

    static Result child(int bit, long prefix, int tb,
                        int xb, int nb, int cmp) {
        int ib = tb ^ xb;
        int nextCmp = cmp;

        if (nextCmp == 0 && ib != nb) {
            nextCmp = ib < nb ? -1 : 1;
        }

        return solve(bit - 1, (prefix << 1) | tb, nextCmp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            x = sc.nextLong();
            long y = sc.nextLong();
            n = sc.nextLong();
            z = x ^ y;

            Result ans = solve(29, 0, 0);
            System.out.println(Math.max(ans.sum, ans.best));
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/XORSCHED)