class Solution {
    public int heightChecker(int[] heights) {
        int c = 0;
        int[] j = heights.clone();   // copy original array
        Arrays.sort(j); 
        for(int i = 0;i<heights.length;i++){
            if(j[i]!=heights[i]) c++;
        }
        return c;
    }
}