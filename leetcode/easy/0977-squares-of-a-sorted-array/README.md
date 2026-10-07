# Squares of a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` sorted in  **non-decreasing**  order, return  *an array of  **the squares of each number**  sorted in non-decreasing order*.

 

 **Example 1:** 

```
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

```

 **Example 2:** 

```
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums is sorted in non-decreasing order.

 

 **Follow up:**  Squaring each element and sorting the new array is very trivial, could you find an `O(n)` solution using a different approach?

## Solution

**Language:** C++  
**Runtime:** 5 ms (beats 34.43%)  
**Memory:** 33 MB (beats 5.26%)  
**Submitted:** 2026-10-07T18:51:58.045Z  

```cpp
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> a;
        vector<int> b;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>=0) b.push_back(nums[i]);
            else a.push_back(nums[i]);
        }

        if(a.size()==0){
            for(int i=0;i<nums.size();i++){
                nums[i]=nums[i]*nums[i];
            }
            return nums;
        }
        if(b.size()==0){
            for(int i=0;i<nums.size();i++){
                nums[i]=nums[i]*nums[i];
            }
            reverse(nums.begin(),nums.end());
            return nums;
        }


        for(int i=0;i<a.size();i++){
            a[i]=a[i]*a[i];
        }
        reverse(a.begin(),a.end());
        for(int i=0;i<b.size();i++){
            b[i]=b[i]*b[i];
        }
        
        //forming ans array by merging
        int i=0;int j=0;int k=0;
        vector<int> ans;
        while(i<a.size() && j<b.size()){
            if(a[i]<=b[j]){
                ans.push_back(a[i]);
                i++;
            }
            else{
                ans.push_back(b[j]);
                j++;
            }
        }
        while(i<a.size()){
            ans.push_back(a[i]);i++;
        }
        while(j<b.size()){
            ans.push_back(b[j]);j++;
        }
        return ans;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/squares-of-a-sorted-array/)