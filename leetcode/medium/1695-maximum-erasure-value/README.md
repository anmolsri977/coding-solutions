# Maximum Erasure Value

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of positive integers `nums` and want to erase a subarray containing  **unique elements**. The  **score**  you get by erasing the subarray is equal to the  **sum**  of its elements.

Return  *the  **maximum score**  you can get by erasing  **exactly one**  subarray.* 

An array `b` is called to be a subarray of `a` if it forms a contiguous subsequence of `a`, that is, if it is equal to `a[l],a[l+1],...,a[r]` for some `(l,r)`.

 

 **Example 1:** 

```
Input: nums = [4,2,4,5,6]
Output: 17
Explanation: The optimal subarray here is [2,4,5,6].

```

 **Example 2:** 

```
Input: nums = [5,2,1,2,5,2,1,2,5]
Output: 8
Explanation: The optimal subarray here is [5,2,1] or [1,2,5].

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 104

## Solution

**Language:** C++  
**Runtime:** 205 ms (beats 21.16%)  
**Memory:** 130.9 MB (beats 39.65%)  
**Submitted:** 2026-10-10T09:43:02.481Z  

```cpp
class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        int sum=0;
        unordered_map<int,int> mp;
        int start=0;int ans=0;
        for(int end=0;end<nums.size();end++){
            sum+=nums[end];
            while(mp.contains(nums[end])){
                sum-=nums[start];
                mp[nums[start]]--;
                if(mp[nums[start]]==0) mp.erase(nums[start]);
                start++;
                 
            }
            mp[nums[end]]++;
            ans=max(ans,sum);
        }
        return ans;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-erasure-value/)