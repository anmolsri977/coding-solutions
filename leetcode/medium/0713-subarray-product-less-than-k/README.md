# Subarray Product Less Than K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of integers `nums` and an integer `k`.

Return the number of contiguous subarrays where the  **product**  of all the elements in the  **subarray**  is  **strictly less**  than `k`.

 

 **Example 1:** 

```
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 0
Output: 0

```

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- 1 <= nums[i] <= 1000
- 0 <= k <= 106

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 16.24%)  
**Memory:** 47.1 MB (beats 99.90%)  
**Submitted:** 2026-10-14T07:16:30.746Z  

```java
class Solution {
    public int numSubarrayProductLessThanK(int[] a, int k) {
         if(k<=1) return 0;
    int start=0;
    Long pro=1L;int c=0;
    
    for(int end=0;end<a.length;end++){
      pro*=a[end];
      while(pro>=k){
        
        pro/=a[start];
        start++;
      }
      c+=end-start+1;
     
    }
     return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-product-less-than-k/)