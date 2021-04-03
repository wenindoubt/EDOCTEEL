class BSTIterator {
    
    public ArrayList<Integer> sortedNodes = new ArrayList<>();
    public int index = -1;

    public BSTIterator(TreeNode root) {
        this.inorderTraversal(root);
    }
    
    private void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        
        this.inorderTraversal(root.left);
        this.sortedNodes.add(root.val);
        this.inorderTraversal(root.right);
    }
    
    public int next() {
        this.index = this.index + 1;
        return this.sortedNodes.get(this.index);
    }
    
    public boolean hasNext() {
        if (this.index + 1 < this.sortedNodes.size()) {
            return true;
        } else {
            return false;
        }
    }
}

// Time complexity is O(n) where n is the number of nodes in the tree.
// inorderTraversal would take O(n)
// + next is O(1)
// + hasNext is O(1)

// Space complexity is O(h) where h is the height of the tree and the
// recursive call stack.
