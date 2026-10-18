# Count Common Words With One Occurrence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two string arrays `words1` and `words2`, return  *the number of strings that appear  **exactly once**  in  **each**  of the two arrays.* 

 

 **Example 1:** 

```
Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
Output: 2
Explanation:
- "leetcode" appears exactly once in each of the two arrays. We count this string.
- "amazing" appears exactly once in each of the two arrays. We count this string.
- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
- "as" appears once in words1, but does not appear in words2. We do not count this string.
Thus, there are 2 strings that appear exactly once in each of the two arrays.

```

 **Example 2:** 

```
Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
Output: 0
Explanation: There are no strings that appear in each of the two arrays.

```

 **Example 3:** 

```
Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"]
Output: 1
Explanation: The only string that appears exactly once in each of the two arrays is "ab".

```

 

 **Constraints:** 

- 1 <= words1.length, words2.length <= 1000
- 1 <= words1[i].length, words2[j].length <= 30
- words1[i] and words2[j] consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 18.89%)  
**Memory:** 46.1 MB (beats 86.86%)  
**Submitted:** 2026-10-18T17:40:20.451Z  

```java
class Solution {
    public int countWords(String[] s1, String[] s2) {
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();

        for (String w : s1)
            m1.put(w, m1.getOrDefault(w, 0) + 1);

        for (String w : s2)
            m2.put(w, m2.getOrDefault(w, 0) + 1);

        int count = 0;

        for (String w : m1.keySet()) {
            if (m1.get(w) == 1 && m2.getOrDefault(w, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-common-words-with-one-occurrence/)