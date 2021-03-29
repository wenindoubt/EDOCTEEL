class Solution {
    public int fib(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        
        return postorderTraversal(n, memo);
    }
    
    private int postorderTraversal(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        if (n <= 1) {
            return n;
        }
        
        int left = postorderTraversal(n - 1, memo);
        int right = postorderTraversal(n - 2, memo);
        
        memo.put(n, left + right);
        
        return memo.get(n);
    }
    
}

// Time Complexity is O(n), where n is the number of nodes in the tree
// where we only calculate the fibonacci number once (starting from the bottom left & right)
// before it gets stored inside of a Hash map for constant time O(1) retrieval.

// Space complexity is O(n), where n is the size of the number of nodes.
