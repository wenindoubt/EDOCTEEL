class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode currentNode = root;
        
        if (currentNode == null) {
            return result;
        }
        
        stack.push(currentNode);
        
        while (!stack.isEmpty()) {
            currentNode = stack.pop();
            result.push(currentNode.val);
            
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
            
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
        }
        
        return result;
    }
}

// Time complexity is O(n) where n is the number of nodes that we have to visit.

// Space complexity is O(n) where n is the size of the stack.
