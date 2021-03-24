class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        if (current == null) {
            return result;
        }

        stack.push(current);

        while (!stack.isEmpty()) {
            current = stack.pop();
            result.addFirst(current.val);

            if (current.left != null) {
                stack.add(current.left);
            }

            if (current.right != null) {
                stack.add(current.right);
            }
        }

        return result;
    }
}
