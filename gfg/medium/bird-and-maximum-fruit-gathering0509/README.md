# bird-and-maximum-fruit-gathering0509

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T16:32:09.143Z  

```cpp
class Solution {
  public:
    int maxPackages(vector<int>& arr, int totalTime) {
        // code here
        int totalPackage = 0;

        for(int i = 0; i < min(totalTime, (int)arr.size()); i++) {
            totalPackage += arr[i];
        }

        int package = totalPackage;
        for(int i = totalTime; i < arr.size(); i++) {
            package += arr[i] - arr[i - totalTime];

            totalPackage = max(package, totalPackage);
        }

        return totalPackage;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/bird-and-maximum-fruit-gathering0509/1)