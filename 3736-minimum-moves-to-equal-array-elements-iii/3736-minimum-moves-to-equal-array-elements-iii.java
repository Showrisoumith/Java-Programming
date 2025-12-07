class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0], c = 0;

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        for (int j = 0; j < nums.length; j++) {
            c += max-nums[j]  ;   // abs not needed
        }

        return c;
    }
}
