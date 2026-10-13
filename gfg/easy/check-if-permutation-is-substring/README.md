# Check if Permutation is Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **txt** and  **pat** having lowercase letters, the task is to check if any permutation of  **pat**  is a substring of  **txt**.

 **Examples:** 

```
Input: txt = "geeks", pat = "eke"
Output: true
Explanation: "eek" is a permutation of "eke" which exists in "geeks".
```

```
Input: txt = "programming", pat = "rain"
Output: false
Explanation: No permutation of "rain" exists as a substring in "programming".

```

 **Constraints:** 
1 ≤ txt.size() ≤ 105
1 ≤ pat.size() ≤ txt.size()
Both the strings consist of lowercase English alphabets.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T15:00:21.569Z  

```cpp
class Solution {
  public:
    bool search(string& txt, string& pat) {
        // Write your code here
        unordered_map<char,int> mp1,mp2;
        for(char c:pat){
            mp1[c]++;
        }
        int start=0;
        for(int end=0;end<txt.size();end++){
            mp2[txt[end]]++;
            if(end-start+1==pat.size()){
                 if(mp1==mp2){
                    return true;
                    }
                mp2[txt[start]]--;
                if(mp2[txt[start]]==0) mp2.erase(txt[start]);
                start++;
            }
           
        }
        return false;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-permutation-is-substring/1)