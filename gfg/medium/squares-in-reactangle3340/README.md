# squares-in-reactangle3340

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T13:47:59.827Z  

```cpp
class Solution {
	public:
	int minSquares(int n, int m) {
		// code here
		int result = 0;
		while (n != 0 && m != 0) {
			if (n <= m) {
				result += m/n;
				m %= n;
			} else {
				result += n/m;
				n %= m;
			}
		}
		return result;
	}
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/squares-in-reactangle3340/1)