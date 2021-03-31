class Solution {
    public boolean isValidBST(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        Integer previousValue = null;
        TreeNode current = root;
        
        while (!stack.isEmpty() || current != null) {
            // traverse left
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            current = stack.pop();
            
            if (previousValue != null && current.val <= previousValue) {
                return false;
            }
            
            previousValue = current.val;
            current = current.right;
        }
        
        return true;
    }

}

// Time complexity is O(n) where n is the number of nodes we have to traverse.

// Space complexity is O(n) where n is the size of the recursive call stack.
