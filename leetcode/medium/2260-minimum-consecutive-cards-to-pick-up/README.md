# Minimum Consecutive Cards to Pick Up

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `cards` where `cards[i]` represents the  **value**  of the `ith` card. A pair of cards are  **matching**  if the cards have the  **same**  value.

Return *the  **minimum**  number of  **consecutive**  cards you have to pick up to have a pair of  **matching**  cards among the picked cards.*  If it is impossible to have matching cards, return `-1`.

 

 **Example 1:** 

```
Input: cards = [3,4,2,3,4,7]
Output: 4
Explanation: We can pick up the cards [3,4,2,3] which contain a matching pair of cards with value 3. Note that picking up the cards [4,2,3,4] is also optimal.

```

 **Example 2:** 

```
Input: cards = [1,0,5,3]
Output: -1
Explanation: There is no way to pick up a set of consecutive cards that contain a pair of matching cards.

```

 

 **Constraints:** 

- 1 <= cards.length <= 105
- 0 <= cards[i] <= 106

## Solution

**Language:** C++  
**Runtime:** 162 ms (beats 17.58%)  
**Memory:** 118.8 MB (beats 92.10%)  
**Submitted:** 2026-10-09T15:00:48.881Z  

```cpp
class Solution {
public:
    int minimumCardPickup(vector<int>& cards) {
        int start=0;int c=INT_MAX;
        unordered_map<int,int> mp;
        for(int end=0;end<cards.size();end++){
            mp[cards[end]]++;
            while(mp[cards[end]]>1){
                c=min(c,end-start+1);
                mp[cards[start]]--;
                if(mp[cards[start]]==0) mp.erase(cards[start]);
                start++;
            }
           
        }
        if(c==INT_MAX) return -1;
        return c;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/)