# maximum-sum-of-subarray-less-than-or-equal-to-x4033

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T14:47:34.433Z  

```cpp
class Solution {
  public:
    int maxSum(vector<int>& arr, int x) {
        // code here
        int start=0;
        int sum=0;
        int ans=0;
        for(int end=0;end<arr.size();end++){
            sum+=arr[end];
            while(sum>x){
                sum-=arr[start];
                start++;
            }
            ans=max(ans,sum);
        }
        return ans;
        
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-sum-of-subarray-less-than-or-equal-to-x4033/1)