class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        // enqueue the initial node
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int queue_size = queue.size();
            List<Integer> nodes_per_level = new ArrayList<>();
            
            // loop through each level
            for (int i = 0; i < queue_size; i++) {
                TreeNode current = queue.poll();
                
                nodes_per_level.add(current.val);
                
                if (current.left != null) {
                    queue.offer(current.left);
                }
                
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            // append each level's nodes to the overall result
            result.add(nodes_per_level);
        }
        
        return result;
    }
}

// Time Complexity is O(n), where n is the number of nodes in the tree.
// We visit each node exactly once.

// Space complexity is O(w), where w is the width of the tree.
// In this case, O(w) = O(n).
