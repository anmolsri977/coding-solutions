# longest-increasing-path-in-a-matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T07:26:56.405Z  

```java
class Solution {
   int n, m;
      int[][] dp;

      int[] row = {-1, 1, 0, 0};
      int[] col = {0, 0, -1, 1};

      int dfs(int[][] arr, int r, int c) {

          if (dp[r][c] != 0) {
              return dp[r][c];
          }

          int best = 1;

          for (int i = 0; i < 4; i++) {

              int nr = r + row[i];
              int nc = c + col[i];

              if (nr >= 0 && nr < n &&
                  nc >= 0 && nc < m &&
                  arr[nr][nc] > arr[r][c]) {

                  best = Math.max(best,
                          1 + dfs(arr, nr, nc));
              }
          }

          dp[r][c] = best;
          return best;
      }

      public int longIncPath(int[][] arr, int n, int m) {

          this.n = n;
          this.m = m;

          dp = new int[n][m];

          int answer = 0;

          for (int i = 0; i < n; i++) {
              for (int j = 0; j < m; j++) {

                  answer = Math.max(answer,
                          dfs(arr, i, j));
              }
          }

          return answer;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-increasing-path-in-a-matrix/1)