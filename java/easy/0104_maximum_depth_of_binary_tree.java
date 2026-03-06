/*
Problem: Maximum Depth of Binary Tree
Platform: LeetCode
Problem No: 104
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Binary tree ki maximum depth ka matlab hai
  root se lekar farthest leaf node tak
  longest path me kitne nodes hain.

- Is problem ko recursion se easily solve
  kiya ja sakta hai.

- Har node ke liye:
      depth = 1 + max(left subtree depth,
                      right subtree depth)

- Agar node null hai to depth = 0.

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar root == null
      return 0
2. leftDepth = maxDepth(root.left)
3. rightDepth = maxDepth(root.right)
4. return max(leftDepth, rightDepth) + 1

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(h)   (recursion stack)

Where:
n = number of nodes
h = height of tree

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
