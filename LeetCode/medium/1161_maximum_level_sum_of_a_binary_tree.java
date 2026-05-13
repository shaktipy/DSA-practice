/*
Problem: Maximum Level Sum of a Binary Tree
Problem No: 1161
Platform: LeetCode
Difficulty: Medium
Topics: Tree, Breadth-First Search (BFS), Binary Tree
Contest: Weekly Contest 150
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given the root of a binary tree, the level of its root is 1,
the level of its children is 2, and so on.

Return the smallest level x such that the sum of all the values
of nodes at level x is maximum.

----------------------------------
Approach:
----------------------------------
1. Use Breadth-First Search (Level Order Traversal).
2. Traverse the tree level by level using a queue.
3. For each level, calculate the sum of node values.
4. Track the maximum sum and its corresponding level.
5. If multiple levels have the same max sum, return the smallest level.

----------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 1;
        int maxLevel = 1;
        int maxSum = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }

            level++;
        }

        return maxLevel;
    }
}
