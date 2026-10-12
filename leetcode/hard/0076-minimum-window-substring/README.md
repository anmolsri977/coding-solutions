# Minimum Window Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two strings `s` and `t` of lengths `m` and `n` respectively, return  *the  **minimum window***   ***substring**  **of  *`s`*  such that every character in  *`t`*  (** including duplicates**) is included in the window *. If there is no such substring, return* the empty string *`""`.

The testcases will be generated such that the answer is  **unique**.

 

 **Example 1:** 

```
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

```

 **Example 2:** 

```
Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.

```

 **Example 3:** 

```
Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.

```

 

 **Constraints:** 

- m == s.length
- n == t.length
- 1 <= m, n <= 105
- s and t consist of uppercase and lowercase English letters.

 

 **Follow up:**  Could you find an algorithm that runs in `O(m + n)` time?

## Solution

**Language:** C++  
**Runtime:** 3 ms (beats 75.54%)  
**Memory:** 11.5 MB (beats 43.42%)  
**Submitted:** 2026-10-12T13:44:20.766Z  

```cpp
class Solution {
public:
    // Finds the minimum valid substring using a sliding window.
    string minWindow(string s, string t) {
        int n = s.size();
        int m = t.size();

        // A valid window cannot exist in these cases.
        if (n == 0 || m == 0 || n < m) {
            return "";
        }

        vector<int> need(128, 0);
        vector<int> window(128, 0);

        // Store how many copies of each character are required.
        for (char ch : t) {
            need[(unsigned char)ch]++;
        }

        int left = 0;
        int matched = 0;
        int minLength = INT_MAX;
        int startIndex = -1;

        // Expand the right boundary across the complete string.
        for (int right = 0; right < n; right++) {
            unsigned char current = s[right];
            window[current]++;

            // Count the new character only if a required copy is satisfied.
            if (
                need[current] > 0 &&
                window[current] <= need[current]
            ) {
                matched++;
            }

            // Shrink while every required character is still satisfied.
            while (matched == m) {
                int currentLength =
                    right - left + 1;

                // Keep the smallest valid window found so far.
                if (currentLength < minLength) {
                    minLength = currentLength;
                    startIndex = left;
                }

                unsigned char leftChar = s[left];
                window[leftChar]--;

                // Losing a required copy makes the window invalid.
                if (
                    need[leftChar] > 0 &&
                    window[leftChar] < need[leftChar]
                ) {
                    matched--;
                }

                left++;
            }
        }

        // No window contained every required character.
        if (startIndex == -1) {
            return "";
        }

        return s.substr(startIndex, minLength);
    }
};


```

---

[View on LeetCode](https://leetcode.com/problems/minimum-window-substring/)