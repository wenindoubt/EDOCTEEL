class Solution {
    public TreeNode inorderPredecessor(TreeNode root, TreeNode p) {
        TreeNode current = root;
        TreeNode target = p;
        
        if (current == null) {
            return null;
        }
        
        if (target.val <= current.val) {
            return inorderPredecessor(current.left, target);
        } else {
            TreeNode left = inorderPredecessor(current.right, target);
            if (right != null) {
                return right;
            } else {
                return current;
            }
        }
    }
}

// Time complexity is O(n) where n is the number of nodes in a tree

// Space complexity is O(h) where h is the height of the tree for our
// recursion call stack.
