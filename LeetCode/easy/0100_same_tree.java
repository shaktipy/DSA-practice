/*
Problem: Same Tree
Platform: LeetCode
Difficulty: Easy
Problem No: 100

------------------------------------------------
Problem Statement:
------------------------------------------------
Given the roots of two binary trees p and q, check whether they are identical.

Two binary trees are identical if:
- They have the same structure.
- Corresponding nodes have the same values.

Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true

Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false

Example 3:
Input: p = [1,2,1], q = [1,1,2]
Output: false

Constraints:
- The number of nodes in each tree is between 0 and 100.
- -10^4 <= Node.val <= 10^4

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
