class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        
        while (node != null) {
            if (val > node.val) {
                if (node.right == null) {
                    node.right = new TreeNode(val);
                    return root;
                } else {
                    node = node.right;
                }
            } else {
                if (node.left == null) {
                    node.left = new TreeNode(val);
                    return root;
                } else {
                    node = node.left;
                }
            }
        }
        return new TreeNode(val);
    }
}

// Time complexity is O(h) where h is the tree height.

// Space complexity is O(1) because we do not use any data structures
// to maintain the stack, nor do we create our own recursive stack.
