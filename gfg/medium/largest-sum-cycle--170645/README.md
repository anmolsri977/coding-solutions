# largest-sum-cycle--170645

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T17:58:28.055Z  

```java
import java.util.*;
class Solution {
    public int largestSumCycle(int[] edge) {
        int n = edge.length;
        boolean[] visited = new boolean[n];
        long maxSum = -1;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int curr = i;
            HashMap<Integer, Integer> map = new HashMap<>();
            while (curr != -1 && !visited[curr]) {
                visited[curr] = true;
                map.put(curr, 1);
                curr = edge[curr];
            }
            // Cycle detected
            if (curr != -1 && map.containsKey(curr)) {
                long sum = 0;
                int node = curr;
                do {
                    sum += node;
                    node = edge[node];
                } while (node != curr);

                maxSum = Math.max(maxSum, sum);
            }
        }
        return (int)maxSum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-sum-cycle--170645/1)