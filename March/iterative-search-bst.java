class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val > root.val ? root.right : root.left;
        }
        return root;
    }
}

// Time complexity is O(h) where h is the height of the BST.

// Space complexity is O(1) because we do not create or manage
// any recursion call stack or stack.
