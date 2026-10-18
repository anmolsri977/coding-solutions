# shortest-path-from-1-to-n0156

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T16:47:52.632Z  

```cpp
class Solution {
  public:
    int minimumStep(int n) {
        // code here
        int ans = 1;
        while(n && ans++) (n%3)?n--:n/=3;
        return ans-2;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/shortest-path-from-1-to-n0156/1)