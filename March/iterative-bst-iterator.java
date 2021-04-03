class BSTIterator {
    public Stack<TreeNode> stack = new Stack<>();
    public int index = -1;

    public BSTIterator(TreeNode root) {
        this.inorderTraversal(root);
    }
    
    public int next() {
        TreeNode node = this.stack.pop();
        
        if (node.right != null) {
            this.inorderTraversal(node.right);
        }
        
        return node.val;
    }
    
    public boolean hasNext() {
        return this.stack.isEmpty() ? false : true;
    }
    
    private void inorderTraversal(TreeNode root) {
        while (root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }
}

// Time complexity is O(n), with the amortized time is O(1)
// because we push and pop each node into the stack exactly once

// Space complexity is O(h) where h is the height of the tree
// and the height of the call stack.
