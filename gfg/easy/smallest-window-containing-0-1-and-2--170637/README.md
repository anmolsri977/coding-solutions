# Smallest window containing 0, 1 and 2

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  consisting only of the characters ' **0'**, ' **1'**  and ' **2'**, determine the length of the  **smallest substring**  that contains all three characters at least once.

If no such substring exists, return  **-1**.

 **Examples :** 

```
Input: s = "10212"
Output: 3
Explanation: The substring "102" is the shortest substring that contains all three characters '0', '1', and '2', so the answer is 3.
```

```
Input: s = "12121"
Output: -1
Explanation: The character '0' is not present in the string, so no substring can contain all three characters '0', '1', and '2'. Hence, the answer is -1.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T16:07:16.779Z  

```java
class Solution {
    public int smallestSubstring(String s) {
        // code here
        int ans=Integer.MAX_VALUE;
        int c=0;
        int start=0;
        int freq[]=new int[3];
        for(int end=0;end<s.length();end++){
            freq[s.charAt(end)-'0']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                ans=Math.min(ans,end-start+1);
                freq[s.charAt(start)-'0']--;
                start++;
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
};

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1)