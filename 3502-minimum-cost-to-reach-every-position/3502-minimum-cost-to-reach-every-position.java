class Solution {
    public int[] minCosts(int[] cost) {
        int[] arr = new int[cost.length];
        int min = cost[0];
        for(int i = 0;i<cost.length;i++){
            if(cost[i]>=min){
                arr[i] = min;
            }
            else{
                min = cost[i];
                arr[i] = min;
            }
        }
        return arr;
    }
}