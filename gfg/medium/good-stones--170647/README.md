# good-stones--170647

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T18:03:52.749Z  

```cpp
class Solution {
  public:
    int goodIndices(vector<int> &arr) {
        int n= arr.size();
        vector<bool>visited(n,false);
        unordered_set<int>possibleIndices;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                int cur = i;
                unordered_set<int>visitedInLoop;
                bool possible = false;
                while(true){
                    if(cur<0 or cur>=n){
                        possible = true;
                        break;
                    }
                    else if(visitedInLoop.find(cur)!= visitedInLoop.end() or arr[cur]==0 ){
                        possible = false;
                        break;
                    }
                    visitedInLoop.insert(cur);
                    cur += arr[cur];
                }
                for(auto it:visitedInLoop){
                    visited[it] = true;
                }
                if(possible){
                    for(auto it:visitedInLoop)possibleIndices.insert(it);
                }

            }
        }
        return possibleIndices.size();


    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/good-stones--170647/1)