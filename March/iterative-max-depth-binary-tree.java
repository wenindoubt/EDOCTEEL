class Solution {
    public int maxDepth(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        
        if (root == null) {
            return 0;
        }
        
        queue.add(root);
        int height = 0;
        TreeNode current = null;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            while (size > 0) {
                current = queue.poll();
                
                if (current.left != null) {
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    queue.add(current.right);
                }
                
                size--;
            }
            
            height++;
        }
        
        return height;
    }
}

// Time Complexity is O(n), where n is the number of nodes in the tree.
// We visit each node exactly once.

// Space complexity is O(w), where w is the width of the tree.
// In this case, O(w) = O(n).
