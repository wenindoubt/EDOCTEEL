class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            // leaf node
            if (root.right == null && root.left == null) {
                return null;
            }
            
            // 1 child
            if (root.right == null) {
                return root.left;
            }
            
            if (root.left == null) {
                return root.right;
            }
            
            // 2 children
            TreeNode temp = this.getSuccessor(root.right);
            root.val = temp.val;
            // After we move the value of the successor to become the new root node,
            // we want to delete that duplicate value from the subtree.
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }
    
    private TreeNode getSuccessor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}

// Time complexity is O(h) where h is the tree height.

// Space complexity is O(h) where h is the tree height or the recursive call stack.
