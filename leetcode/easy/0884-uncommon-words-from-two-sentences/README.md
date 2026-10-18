# Uncommon Words from Two Sentences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **sentence**  is a string of single-space separated words where each word consists only of lowercase letters.

A word is  **uncommon**  if it appears exactly once in one of the sentences, and  **does not appear**  in the other sentence.

Given two  **sentences**  `s1` and `s2`, return  *a list of all the  **uncommon words***. You may return the answer in  **any order**.

 

 **Example 1:** 

 **Input:**  s1 = "this apple is sweet", s2 = "this apple is sour"

 **Output:**  ["sweet","sour"]

 **Explanation:** 

The word `"sweet"` appears only in `s1`, while the word `"sour"` appears only in `s2`.

 **Example 2:** 

 **Input:**  s1 = "apple apple", s2 = "banana"

 **Output:**  ["banana"]

 

 **Constraints:** 

- 1 <= s1.length, s2.length <= 200
- s1 and s2 consist of lowercase English letters and spaces.
- s1 and s2 do not have leading or trailing spaces.
- All the words in s1 and s2 are separated by a single space.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.44%)  
**Memory:** 42.8 MB (beats 98.60%)  
**Submitted:** 2026-10-18T17:28:36.453Z  

```java
class Solution {
    public String[] uncommonFromSentences(String a, String b) {
        String s1[]=a.split(" ");
        String s2[]=b.split(" ");
        Map<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<s1.length;i++){
            map.put(s1[i],map.getOrDefault(s1[i],0)+1);
        }
        for(int i=0;i<s2.length;i++){
            map.put(s2[i],map.getOrDefault(s2[i],0)+1);
        }
        for(String word:map.keySet()){
            if(map.get(word)==1){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/uncommon-words-from-two-sentences/)