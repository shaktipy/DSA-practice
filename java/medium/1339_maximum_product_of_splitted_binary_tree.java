/*
Problem: Maximum Product of Splitted Binary Tree
Platform: LeetCode
Difficulty: Medium
Topics: Tree, Depth-First Search, Binary Tree
Contest: Weekly Contest 174

----------------------------------
Problem Statement:
----------------------------------
Given the root of a binary tree, split the tree into two subtrees by removing
one edge such that the product of the sums of the two subtrees is maximized.

Return the maximum product modulo (10^9 + 7).
Note: The product should be maximized before applying modulo.

----------------------------------
Approach:
----------------------------------
1. First DFS to calculate the total sum of the tree.
2. Second DFS to compute subtree sums.
3. For each subtree, consider removing the edge above it.
4. Compute product:
   subtreeSum * (totalSum - subtreeSum)
5. Track the maximum product.

----------------------------------
Time Complexity: O(n)
Space Complexity: O(n)   (recursion stack)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    private long totalSum = 0;
    private long maxProduct = 0;
    private final int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        totalSum = getTotalSum(root);
        getSubtreeSum(root);
        return (int)(maxProduct % MOD);
    }

    // First DFS: calculate total sum
    private long getTotalSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + getTotalSum(node.left) + getTotalSum(node.right);
    }

    // Second DFS: calculate subtree sums & product
    private long getSubtreeSum(TreeNode node) {
        if (node == null) return 0;

        long left = getSubtreeSum(node.left);
        long right = getSubtreeSum(node.right);

        long subTreeSum = node.val + left + right;

        long product = subTreeSum * (totalSum - subTreeSum);
        maxProduct = Math.max(maxProduct, product);

        return subTreeSum;
    }
}
