# roll-the-characters-of-a-string2127

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T17:23:56.080Z  

```cpp
class Solution {
public:
    string findRollOut(string& s, vector<int>& roll) {
        sort(roll.begin(), roll.end());
        int i = 0;
        for (int j = 0; j < roll.size(); j++) {
            while (i < roll[j]) {
                s[i] = 'a' + (((s[i] - 'a') + roll.size() - j) % 26);
                i++;
            }
        }
        return s;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/roll-the-characters-of-a-string2127/1)