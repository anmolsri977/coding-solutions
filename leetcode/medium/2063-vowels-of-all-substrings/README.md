# Vowels of All Substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `word`, return  *the  **sum of the number of vowels**  (* `'a'`, `'e'` *,*  `'i'` *,*  `'o'` *, and*  `'u'` *)*   *in every substring of* `word`.

A  **substring**  is a contiguous (non-empty) sequence of characters within a string.

 **Note:**  Due to the large constraints, the answer may not fit in a signed 32-bit integer. Please be careful during the calculations.

 

 **Example 1:** 

```
Input: word = "aba"
Output: 6
Explanation: 
All possible substrings are: "a", "ab", "aba", "b", "ba", and "a".
- "b" has 0 vowels in it
- "a", "ab", "ba", and "a" have 1 vowel each
- "aba" has 2 vowels in it
Hence, the total sum of vowels = 0 + 1 + 1 + 1 + 1 + 2 = 6. 

```

 **Example 2:** 

```
Input: word = "abc"
Output: 3
Explanation: 
All possible substrings are: "a", "ab", "abc", "b", "bc", and "c".
- "a", "ab", and "abc" have 1 vowel each
- "b", "bc", and "c" have 0 vowels each
Hence, the total sum of vowels = 1 + 1 + 1 + 0 + 0 + 0 = 3.

```

 **Example 3:** 

```
Input: word = "ltcd"
Output: 0
Explanation: There are no vowels in any substring of "ltcd".

```

 

 **Constraints:** 

- 1 <= word.length <= 105
- word consists of lowercase English letters.

## Solution

**Language:** C++  
**Runtime:** 0 ms  
**Memory:** 7.7 MB  
**Submitted:** 2026-10-12T16:34:13.644Z  

```cpp

class Solution {
public:
    int vowelIn(string s) {
        int count = 0;
        for(int i = 0; i < s.size(); i++) {
            char c = s[i];
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                count++;
            }
        }
        return count;
    }

    long long countVowels(string word) {
        long long ans = 0;
        int c = 0;
        int n = word.size();

        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {
                string w = word.substr(start, end - start + 1);
                c = vowelIn(w);
                ans += c;
            }
        }

        return ans;
    }
};

```

---

[View on LeetCode](https://leetcode.com/problems/vowels-of-all-substrings/)