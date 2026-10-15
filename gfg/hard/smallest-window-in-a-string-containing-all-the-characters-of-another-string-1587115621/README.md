# Smallest Window with All

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two strings  **s**  and  **p**, find the smallest substring in s consisting of all the characters (including duplicates) of the string p.

- Return empty string in case no such substring is present. 
- If there are multiple such substring of the same length found, return the one with the least starting index.

 **Examples:** 

```
Input: s = "timetopractice", p = "toc"
Output: "toprac"
Explanation: "toprac" is the smallest substring in which "toc" can be found.

```

```
Input: s = "zoomlazapzo", p = "oza"
Output: "apzo"
Explanation: "apzo" is the smallest substring in which "oza" can be found.

```

```
Input: s = "zoom", p = "zooe"
Output: ""
Explanation: No substring is present containing all characters of p.
```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T15:43:26.141Z  

```cpp
class Solution {
  public:
    string minWindow(string &s, string &p){
        
        unordered_map<char,int> mp;
        for(int i=0;i<p.size();i++){
            mp[p[i]]++;
        }
        
        int count=0;
        int sindex=-1;
        int start=0;
        int minLen=INT_MAX;
        int m=p.size();
        int n=s.size();
        for(int end=0;end<s.size();end++){
            if(mp[s[end]]>0){
                count++;
            }
            mp[s[end]]--;
            while(count==p.size()){
                if(end-start+1<minLen){
                    minLen=end-start+1;
                    sindex=start;}
                    
                mp[s[start]]++;
                if(mp[s[start]]>0) count=count-1;
                start++;
            }
            }
        
        if(sindex==-1) return "";
        return s.substr(sindex,minLen);
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1)