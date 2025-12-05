class Solution {
    public int countPartitions(int[] nums) {
        int s = 0;
        for(int i = 0;i<nums.length-1;i++){
            int ls = 0,rs = 0;;
            for(int j =0;j<=i;j++){
                ls+=nums[j];
            }
            for(int k = i+1;k<nums.length;k++){
                rs+=nums[k];
            }
            if((ls-rs)%2==0) s++;
        }
        return s;
    }
}