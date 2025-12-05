class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] so = new int[nums.length];
        for(int i =0;i<nums.length;i+=2){
            // temp = nums[i+1];
            so[i]=nums[i+1];
            so[i+1]=nums[i];
        }
        return so;
    }
}