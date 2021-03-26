class Solution {
    public int maxDepth(TreeNode root) {
        // max_height = max(height(subtree(left), height(subtree(right)))) + 1
        // the initial root node will always have a depth of 1; hence +1
        if (root == null) {
            return 0; // tree does not exist; height is 0
        }
        
        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);
        
        return Math.max(left_height, right_height) + 1;
    }
}

// Time Complexity is O(n), where n is the number of nodes in the tree.
// We visit each node exactly once.

// Space complexity is O(h), where h is the height of the tree.
// In this case, O(h) = O(n).

// If this was a balanced binary search tree, space complexity would
// be equal to O(log(n)), where n is the number of nodes in the tree.
