class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        return dfs(root, new ArrayList<Integer>());
    }
    
    private List<Integer> dfs(TreeNode root, List<Integer> result) {
        if (root == null) {
            return result;
        }
        
        dfs(root.left, result);
        dfs(root.right, result);
        result.add(root.val);
        
        return result;
    }
}

// Time Complexity is O(n), where n is the number of nodes in the tree.
// We visit each node exactly once.

// Space complexity is O(h), where h is the height of the tree.
// In this case, O(h) = O(n).

// If this was a balanced binary search tree, space complexity would
// be equal to O(log(n)), where n is the number of nodes in the tree.
