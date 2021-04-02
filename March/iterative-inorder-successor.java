class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor = null;
        TreeNode current = root;
        TreeNode target = p;
        
        while (current != null) {
            if (target.val >= current.val) {
                current = current.right;
            } else {
                successor = current;
                current = current.left;
            }
        }
        return successor;
    }
}

// Time complexity is O(n) where n is the number of nodes in the BST.

// Space complexity is O(1) because we do not have have our own stack
// nor do we have any recursion call stacks.
