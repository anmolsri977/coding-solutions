# Smallest Subarray Sum Greater Than x

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **x** and an array of integers  **arr**, find the smallest subarray with sum strictly greater than the given value. If such a subarray do not exist return 0 in that case.

 **Examples:** 

```
Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
Output: 3
Explanation: Minimum length subarray is [4, 45, 6]
```

```
Input: x = 100, arr[] = [1, 10, 5, 2, 7]
Output: 0
Explanation: No subarray exist
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T15:08:13.350Z  

```java
class Solution {
    public static int smallestSubWithSum(int x, int[] a) {
        // code here
        int sum=0;int ans=Integer.MAX_VALUE;
        int start=0;
        for(int end=0;end<a.length;end++){
            sum+=a[end];
            while(sum>x){
                ans=Math.min(ans,end-start+1);
                sum-=a[start];
                start++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1)