# Equilibrium Point

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers **arr[]**, the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists. 

 **Examples:** 

```
Input: arr[] = [1, 2, 0, 3]
Output: 2 
Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
```

```
Input: arr[] = [1, 1, 1, 1]
Output: -1
Explanation: There is no equilibrium index in the array.

```

```
Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
Output: 3
Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.
```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T16:48:23.557Z  

```cpp
class Solution {
  public:
    int findEquilibrium(vector<int> &arr) {
        // code here
        int left=0;int total=0;
        for(int x:arr){
            total+=x;
        }
        int right=0;
        for(int i=1;i<arr.size();i++){
            left+=arr[i-1];
            right=total-left-arr[i];
            if(left==right){
                return i;
            }
        }
        return -1;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1)