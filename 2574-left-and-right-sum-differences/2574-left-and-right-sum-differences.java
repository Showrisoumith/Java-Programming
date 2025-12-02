class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
         int[] result = new int[nums.length];
        int[] rigth = new int[nums.length];
        left[0] = 0;
        int k = 1;
        int s =0,s1=0;
        int x = nums.length-2;
        rigth[nums.length-1] = 0;
        for(int i =0;i<nums.length-1;i++){
            s+=nums[i];
            left[k]=s;
            k++;
        }
        for(int j=nums.length-1;j>=1;j--){
            s1+=nums[j];
            rigth[x]=s1;
            x--;
        }
        for (int i = 0; i < left.length; i++) {
            result[i] = Math.abs( left[i] - rigth[i]);
        }
        return result;
    }
}