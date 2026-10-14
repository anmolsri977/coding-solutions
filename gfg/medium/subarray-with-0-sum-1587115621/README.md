# Zero Sum Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers,  **arr[]**. Find if there is a subarray (of size at least one) with  **0** sum. Return true/false depending upon whether there is a subarray present with 0-sum or not. 

 **Examples:** 

```
Input: arr[] = [4, 2, -3, 1, 6]
Output: true
Explanation: 2, -3, 1 is the subarray with a sum of 0.
```

```
Input: arr = [4, 2, 0, 1, 6]
Output: true
Explanation: 0 is one of the elements in the array so there exist a subarray with sum 0.
```

```
Input: arr = [1, 2, -1]
Output: false
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T11:19:33.568Z  

```java
class Solution {
    public boolean subArrayExists(int arr[]) {
        // code here
        Set<Integer> set=new HashSet<>();
        int prefix=0;
        for(int x:arr){
            prefix+=x;
            if(prefix==0 || set.contains(prefix)){
                return true;
            }
            set.add(prefix);
        }
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1)