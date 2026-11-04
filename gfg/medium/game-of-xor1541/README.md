# game-of-xor1541

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T18:31:31.903Z  

```cpp
class Solution {
  public:
    int subarrayXor(vector<int>& arr) {
        // code here
        int pre = 0;
        int ans = 0;
        int n = arr.size();

        for(int i=0;i<n;i++){
            if((i+1)%2)pre^=arr[i];
            ans^=pre;
        }

        return ans;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/game-of-xor1541/1)