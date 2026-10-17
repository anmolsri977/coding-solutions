# check-if-it-is-possible-to-convert-one-string-into-another-with-given-constraints4116

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T14:58:57.943Z  

```java
class Solution {
    public boolean isItPossible(String s1, String s2) {
        // code here
        if(s1.length() != s2.length())
            return false;
        int len = s1.length();
        int countA = 0;
        int countB = 0;
        for(int i=0;i<len;i++)
        {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 == 'A')
                countA ++;
            else if(ch1 == 'B')
                countB++;

            if(ch2 == 'A')
                countA --;
            else if(ch2 == 'B')
                countB--;
            // s1 has more A till now
            if(countA>0)
                return false;
            if(countB<0)
                return false;
            if(countB>0 && countA<0)
                return false;

        }
        return true;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-it-is-possible-to-convert-one-string-into-another-with-given-constraints4116/1)