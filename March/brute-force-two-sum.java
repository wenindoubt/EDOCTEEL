class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}

// Time complexity is O(n^2) where n is the array of numbers
// and we have to iterate over the elements twice.

// Space complexity is O(1) because no matter how large the input
// grows, we still only return an array of size 2.
