# CHANGEONE7

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Change One

You are given an array $A$ of $N$ integers, and you can change exactly one element in it.

After changing one element, find the minimum possible value of $\max(A) - \min(A)$, where $\max(A)$ denotes the maximum element of the array $A$, and $\min(A)$ denotes the minimum element of the array.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output the minimum possible value of $\max(A) - \min(A)$ after changing one element.

### Constraints
- $1 \le T \le 100$
- $2 \le N \le 100$
- $1 \le A_i \le 100$
### Sample 1:
Input
Output

```
3
2
7 4
3
1 4 6
3
1 3 6

```

```
0
2
2
```

### Explanation:

 **Test Case 1:**  Change $A_2 = 7$ to get $[7, 7]$ which has $\max(A) - \min(A) = 0$.

 **Test Case 2:**  Change $A_1 = 4$ to get $[4, 4, 6]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T15:47:51.613Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    if(n==2){
		        System.out.println(0);
		        continue;
		    }
		    int p=a[n-1]-a[1];
		    int q=a[n-2]-a[0];
		    int ans=Math.min(p,q);
		    System.out.println(ans);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHANGEONE7)