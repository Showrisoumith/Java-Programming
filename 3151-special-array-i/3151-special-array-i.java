class Solution {
    public boolean isArraySpecial(int[] nums) {
        int c = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]%2==0){
                if(nums[i+1]%2==0){
                 c++;
                break;
                }
            }
            else if(nums[i]%2 != 0){
                if(nums[i+1]%2!=0){
                 c++;
                break;
                }
            }
        }
        if(c>0) return false;
        else return true;
    }
}