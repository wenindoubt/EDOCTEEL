class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        
        memo.put(0, 1);
        memo.put(1, 1);
        
        return recurse(n, memo);
    }
    
    private int recurse(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        int result = recurse(n - 1, memo) + recurse(n - 2, memo);
        memo.put(n, result);
        
        return result;
    }
}

// Time complexity is O(n) where n is the number of stairs.

// Space complexity is O(n) where n is the number of stairs that gets
// cached so we can reuse for other subproblems.
