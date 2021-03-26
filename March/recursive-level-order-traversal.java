class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        return dfs_preorder(root, result, 0);
    }
    
    private List<List<Integer>> dfs_preorder(TreeNode root, List<List<Integer>> result, int level) {
        
        System.out.println("result.size() is: " + result.size());
        
        // if the level that we're on is the same as the size of the array
        // that means its our first time on this level and we should create a new array
        // to support adding new values
        if (result.size() == level) {
            result.add(new ArrayList<Integer>());
        }
        
        result.get(level).add(root.val);
        
        if (root.left != null) {
            dfs_preorder(root.left, result, level + 1);
        }
        
        if (root.right != null) {
            dfs_preorder(root.right, result, level + 1);
        }
        
        return result;
    }
}

// Time Complexity is O(n), where n is the number of nodes in the tree.
// We visit each node exactly once.

// Space complexity is O(h), where h is the height of the tree.
// In this case, O(h) = O(n).

// If this was a balanced binary search tree, space complexity would
// be equal to O(log(n)), where n is the number of nodes in the tree.
