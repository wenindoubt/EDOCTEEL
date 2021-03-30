class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        
        return helper(nums, target, memo);
    }
    
    private int[] helper(int[] nums, int target, HashMap<Integer, Integer> memo) {
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            
            if (memo.containsKey(remainder)) {
                result[0] = memo.get(remainder);
                result[1] = i;
                return result;
            }
            
            memo.put(nums[i], i);
        }
        return result;
    }
}

// Time complexity is O(n + 1) where n is the number of elements we
// loop through.

// Space complexity is O(n * m) (k, v) where n is the number of elements
// in the array and m is the complement (target). This assumes that there is 
// potentially no complement match for the two sum and we store the
// entire array of information.
