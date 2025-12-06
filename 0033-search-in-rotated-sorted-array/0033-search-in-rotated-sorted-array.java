class Solution {
    private int res(int[] nums, int k){
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==k)return i;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
          
         return res(nums,target);
    }
}