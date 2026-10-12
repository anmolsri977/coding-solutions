# Number of Substrings Containing All Three Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` consisting only of characters  *a*,  *b*  and  *c*.

Return the number of substrings containing  **at least**  one occurrence of all these characters  *a*,  *b*  and  *c*.

 

 **Example 1:** 

```
Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 

```

 **Example 2:** 

```
Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 

```

 **Example 3:** 

```
Input: s = "abc"
Output: 1

```

 

 **Constraints:** 

- 3 <= s.length <= 5 x 104
- s only consists of 'a', 'b' or 'c' characters.

## Solution

**Language:** C++  
**Runtime:** 42 ms (beats 10.68%)  
**Memory:** 16.9 MB (beats 7.62%)  
**Submitted:** 2026-10-12T16:12:34.400Z  

```cpp
class Solution {
public:
    int numberOfSubstrings(string s) {
        unordered_map<char,int> mp;
        int start=0;
        int c=0;
        int n=s.size();
        for(int end=0;end<s.size();end++){
            mp[s[end]]++;
            while(mp.size()==3){
                c+=n-end;
                mp[s[start]]--;
                if(mp[s[start]]==0) mp.erase(s[start]);
                start++;
            }
        }
        return c;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/)