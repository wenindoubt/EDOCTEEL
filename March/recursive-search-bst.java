class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode current = root;
        
        return this.recurse(current, val);
    }
    
    private TreeNode recurse(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        
        return val > current.val ? recurse(current.right, val) : recurse(current.left, val);
    }
}

// Time complexity is O(h) where h is the height of the tree.

// Space complexity is O(h) where h is the height of the tree.

// Average case for time & space is O(log(n)) where we traverse half a balanced BST.
