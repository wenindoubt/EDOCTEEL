class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int i = 0, j = 0, max = 0;
        HashSet<Character> set = new HashSet<>();
        
        while (j < s.length()) {
            char c = s.charAt(j);
            while (set.contains(c)) {
                set.remove(s.charAt(i)); // this is the trick to the sliding window
                i++;
            }
            set.add(c);
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}

// Time complexity is O(2n) = O(n), where n is the length of the string
// and we have to iterate through each character twice, once by i & j.

// Space complexity is O(n) where n is the length of the string and we have
// to store the entire string inside of the set.
