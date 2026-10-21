class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, the trees are identical up to this point
        if (p == null && q == null) {
            return true;
        }
        
        // If one node is null and the other is not, they are not identical
        if (p == null || q == null) {
            return false;
        }
        
        // If the values are different, they are not identical
        if (p.val != q.val) {
            return false;
        }
        
        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
