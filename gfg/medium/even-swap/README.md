# even-swap

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T12:43:54.571Z  

```java
class Solution {
    public ArrayList<Integer> lexicographicallyLargest(int[] arr) {
        // code here
       int n = arr.length;
       ArrayList<Integer> ans = new ArrayList<>();

       for (int i=0; i<n;) {
           ArrayList<Integer> temp = new ArrayList<>();
           temp.add(arr[i]);

           while (++i < n) {
               if (arr[i-1]%2 == arr[i]%2)
                   temp.add(arr[i]);
               else
                   break;
           }

           Collections.sort(temp, Collections.reverseOrder());
           ans.addAll(temp);
       }

       return ans;
    }
}


```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/even-swap/1)