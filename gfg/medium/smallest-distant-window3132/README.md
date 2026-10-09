# Smallest Window Length with All

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s,**  your task is to find the length of the smallest window that contains all the characters of the given string at least once.

 **Example:** 

```
Input: s = "aabcbcdbca"
Output: 4
Explanation: Sub-String "dbca" has the smallest length that contains all the characters of string s.

```

```
Input: s = "aaab"
Output: 2
Explanation: Sub-String "ab" has the smallest length that contains all the characters of string s.
```

```
Input: s = "geeksforgeeks"
Output: 7
Explanation: There are multiple substring with smallest length that contains all characters of string s, "eksforg" and "ksforge". 
```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T16:19:15.688Z  

```cpp
class Solution {
  public:
    int findSubString(string& s) {
        // code here
        unordered_set<char> st(s.begin(),s.end());
        unordered_map<char,int> m2;

        int start=0;
        int ans=INT_MAX;
        for(int end=0;end<s.length();end++){
            m2[s[end]]++;
            while(m2.size()==st.size()){
                ans=min(ans,end-start+1);
                m2[s[start]]--;
                if(m2[s[start]]==0) m2.erase(s[start]);
                start++;
            }
            
        }
        return ans;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-distant-window3132/1)