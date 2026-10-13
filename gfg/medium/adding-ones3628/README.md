# adding-ones3628

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T14:40:10.114Z  

```cpp
class Solution {
  public:
    vector<int> update(int n, vector<int>& updates) {
        // code here
        vector<int>ans(n, 0);
        for(auto it : updates){
            ans[it-1]++;
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=ans[i];
            ans[i] = sum;
        }
        return ans;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/adding-ones3628/1)