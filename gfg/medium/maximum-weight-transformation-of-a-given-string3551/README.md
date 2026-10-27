# maximum-weight-transformation-of-a-given-string3551

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T16:45:41.297Z  

```cpp
class Solution {
  public:
    int getMaxWeight(string &s) {
        int n = s.size();
        if (n == 0) return 0;
        int m = n - 1;
        vector<int> gain(m);
        for (int i = 0; i < m; i++) {
            gain[i] = (s[i] == s[i + 1] ? 1 : 2);
        }
        vector<int> dp(m + 1, 0);
        for (int i = 1; i <= m; i++) {
            dp[i] = max(dp[i - 1], (i >= 2 ? dp[i - 2] : 0) + gain[i - 1]);
        }
        return n + dp[m];
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-weight-transformation-of-a-given-string3551/1)