# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return  *the length of the longest substring containing the same letter you can get after performing the above operations*.

 

 **Example 1:** 

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

```

 **Example 2:** 

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only uppercase English letters.
- 0 <= k <= s.length

## Solution

**Language:** C++  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 10.9 MB (beats 70.80%)  
**Submitted:** 2026-10-11T14:20:51.984Z  

```cpp
class Solution {
public:
    
    int characterReplacement(string s, int k) {
        int n = s.size();
 
        if (n == 0 || k < 0) {
            return 0;
        }
 
        vector<int> frequency(26, 0);
 
        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;
 
        for (int right = 0; right < n; right++) {
            int index = s[right] - 'A';
            frequency[index]++;
 
            maxFrequency = max(
                maxFrequency,
                frequency[index]
            );
 
            int currentLength =
                right - left + 1;

            if (currentLength - maxFrequency > k) {
                frequency[s[left] - 'A']--;
                left++;
            }
 
            currentLength =
                right - left + 1;
 
            maxLength = max(
                maxLength,
                currentLength
            );
        }
 
        return maxLength;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)