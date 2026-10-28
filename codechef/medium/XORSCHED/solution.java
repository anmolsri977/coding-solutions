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
