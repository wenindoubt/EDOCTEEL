class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }
    
    private boolean dfs(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true; // because a BST is not effected by a null node
        }
        
        if ((min != null && root.val <= min) ||
            (max != null && root.val >= max)) {
            return false;
        }
        
        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }
}

// Time complexity is O(n) where n is the number of nodes because we traverse
// the entire tree.

// Space complexity is O(n) where n is the size of the recursive call stack.
