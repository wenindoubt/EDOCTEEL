class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        // enqueue the initial node
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int queue_size = queue.size();
            List<Integer> nodes_per_level = new ArrayList<>();
            
            for (int i = 0; i < queue_size; i++) {
                //  poll() would throw an exception if the queue is empty
                TreeNode current = queue.remove();
                
                nodes_per_level.add(current.val);
                
                if (current.left != null) {
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            result.add(nodes_per_level);
        }
        
        return result;
    }
}

// Time Complexity is O(n), where n is the number of nodes in the tree.
// We visit each node exactly once.

// Space complexity is O(w), where w is the width of the tree.
// In this case, O(w) = O(n).
