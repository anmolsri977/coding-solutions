# Max Path Sum Between Two Leaves

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given the root of a binary tree, where each node contains an integer value, find the maximum possible path sum between any two leaf nodes. If the tree has fewer than two leaf nodes, return -1.

 **Examples:** 

```
Input: root = [3, 4, 5, -10, 4, N, N]
                   
Output: 16
Explanation: 

The leaf nodes are -10, 4 (right child of 4), and 5.
Possible paths between leaf nodes are:
-10 -> 4 -> 3 -> 5 = -10 + 4 + 3 + 5 = 2
-10 -> 4 -> 4 = -10 + 4 + 4 = -2
4 -> 4 -> 3 -> 5 = 4 + 4 + 3 + 5 = 16
Hence, the maximum path sum is obtained from the path 4 -> 4 -> 3 -> 5, giving 16.

```

```
Input: root = [-15, 5, 6, -8, 1, 3, 9, 2, -3, N, N, N, N, N, 0, N, N, N, N, 4, -1, N, N, 10]

Output: 27
Explanation: 

The leaf nodes are 2, -3, 1, 4, and 10.
Some possible paths between leaves are:
2 -> -8 -> 5 -> 1 = 2 + (-8) + 5 + 1 = 0
-3 -> -8 -> 5 -> 1 = -3 + (-8) + 5 + 1 = -5
2 -> -8 -> 5 -> -15 -> 6 -> 3 = 2 + (-8) + 5 + (-15) + 6 + 3 = -7
1 -> 5 -> -15 -> 6 -> 9 -> 0 -> 4 = 1 + 5 + (-15) + 6 + 9 + 0 + 4 = 10
3 -> 6 -> 9 -> 0 -> -1 -> 10 = 3 + 6 + 9 + 0 + (-1) + 10 = 27
Hence, the maximum path sum is obtained from the path 3 -> 6 -> 9 -> 0 -> -1 -> 10, giving 27.

```

```
Input: root = [3, 4, 1, -10, 4, N, N] 
                         
Output: 12
Explanation:

The leaf nodes are -10, 4 (right child of 4), and 1.
Possible paths between leaf nodes are:
-10 -> 4 -> 4 = -10 + 4 + 4 = -2
-10 -> 4 -> 3 -> 1 = -10 + 4 + 3 + 1 = -2
4 -> 4 -> 3 -> 1 = 4 + 4 + 3 + 1 = 12
Hence, the maximum path sum is obtained from the path 4 -> 4 -> 3 -> 1, giving 12.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T17:36:21.732Z  

```java
class Solution {
    int maxSum;
    boolean hasTwoLeaves;

    public int maxPathSum(Node root) {
        maxSum = Integer.MIN_VALUE;
        hasTwoLeaves = false;

        findMax(root);

        return hasTwoLeaves ? maxSum : -1;
    }

    private int findMax(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        if (node.left == null && node.right == null) {
            return node.data;
        }

        int left = findMax(node.left);
        int right = findMax(node.right);

        if (node.left != null && node.right != null) {
            hasTwoLeaves = true;
            maxSum = Math.max(maxSum, left + node.data + right);

            return node.data + Math.max(left, right);
        }

        if (node.left != null) {
            return node.data + left;
        }

        return node.data + right;
    }
}


```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-path-sum/1)