class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        for(int i = min ; i<=max;i++){
            int c = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[j]==i)c++;
            }
            if(c==0)list.add(i);
        }
        return list;
    }
}