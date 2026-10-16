# count-always-found

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T14:11:21.963Z  

```java
class Solution {
    public int countAlwaysFound(int[] arr) {
        int n = arr.length;
        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        prefixMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }

        suffixMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], arr[i]);
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean leftOK = i == 0 || arr[i] > prefixMax[i - 1];
            boolean rightOK = i == n - 1 || arr[i] < suffixMin[i + 1];

            if (leftOK && rightOK) {
                count++;
            }
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-always-found/1)