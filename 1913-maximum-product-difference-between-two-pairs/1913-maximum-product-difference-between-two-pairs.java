class Solution {
    public int maxProductDifference(int[] nums) {
    //     int max = Arrays.stream(nums).max();
    //     int p1 = max;
    //    int min = Arrays.stream(nums).min();
    //    int p2 = min;
    // //    int max = Integer.MIN_VALUE;
    //     for(int i  =0 ;i<nums.length;i++){
    //         if(nums[i]==max){
    //             nums[i]=-1;
    //             max = Arrays.stream(nums).max();
    //             p1*=max;
    //         }
    //         if(nums[i]==min){
    //             nums[i]=-1;

    //         }
    //     }
    Arrays.sort(nums);
    int p1 = nums[0]*nums[1];
    int p2 = nums[nums.length-1]*nums[nums.length-2];
    return p2-p1;
    }
}