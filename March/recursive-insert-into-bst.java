class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        
        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        
        return root;
    }
}

// Time complexity is O(h) where h is the height of the tree
// as well as the recursive call stack.

// Space complexity is O(h) where h is the height of the tree
// as well as the recursive call stack.
