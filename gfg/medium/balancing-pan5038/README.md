# balancing-pan5038

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T16:09:25.095Z  

```java
class Solution {
    public boolean balancePan(int a, int b) {
        // code here
        while (b > 0) {
                    int r = b % a;

                    if (r == 0) {
                        b = (int)Math.floor(b / a);
                    } else if (r == 1) {
                        b = (int)Math.floor((b - 1) / a);
                    } else if (r == a - 1) {
                        b = (int)Math.floor((b + 1) / a);
                    } else {
                        return false;
                    }
                }

                return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/balancing-pan5038/1)