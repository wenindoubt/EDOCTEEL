class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode current = root;
        TreeNode target = p;
        
        if (current == null) {
            return null;
        }
        
        if (target.val >= current.val) {
            return inorderSuccessor(current.right, target);
        } else {
            TreeNode left = inorderSuccessor(current.left, target);
            if (left != null) {
                return left;
            } else {
                return current;
            }
        }
    }
}

// Time complexity is O(n) where n is the number of nodes in a tree

// Space complexity is O(h) where h is the height of the tree for our
// recursion call stack.
