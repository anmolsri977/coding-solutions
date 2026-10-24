# trace-path3840

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T17:53:44.800Z  

```cpp
class Solution {
  public:
    bool isPossible(int n, int m, string& s) {
        // code here
        int l = 0;
        int r = 0;
        int u = 0;
        int d = 0;

        for(auto c : s){

            if(c=='R'){
                r++;
                if(l)l--;
                if(r>=m)return 0;
            }
            else if(c=='L'){
                l++;
                if(r)r--;
                if(l>=m)return 0;
            }
            else if(c=='U'){
                u++;
                if(d)d--;
                if(u>=n)return 0;
            }
            else{
                d++;
                if(u)u--;
                if(d>=n)return 0;
            }

        }

        return 1;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/trace-path3840/1)