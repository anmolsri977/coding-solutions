# Count Integers With Even Digit Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer `num`, return  *the number of positive integers  **less than or equal to***  `num`  *whose digit sums are  **even***.

The  **digit sum**  of a positive integer is the sum of all its digits.

 

 **Example 1:** 

```
Input: num = 4
Output: 2
Explanation:
The only integers less than or equal to 4 whose digit sums are even are 2 and 4.    

```

 **Example 2:** 

```
Input: num = 30
Output: 14
Explanation:
The 14 integers less than or equal to 30 whose digit sums are even are
2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.

```

 

 **Constraints:** 

- 1 <= num <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 84.57%)  
**Memory:** 41.5 MB (beats 96.21%)  
**Submitted:** 2026-10-18T16:55:24.217Z  

```java
class Solution {
    public boolean digSum(int x){
        int sum=0;
        while(x!=0){
            int d=x%10;
            sum+=d;
            x/=10;
        }
        return sum%2==0;
    }
    public int countEven(int num) {
        int c=0;
        for(int i=1;i<=num;i++){
            if(digSum(i)){
                c++;
            }
        }
        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-integers-with-even-digit-sum/)