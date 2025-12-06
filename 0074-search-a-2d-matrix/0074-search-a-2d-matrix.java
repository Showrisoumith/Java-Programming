class Solution {
    private boolean res(int[][] mat , int t){
        int c = 0;
        for(int i=0;i<mat.length;i++){
            if(Arrays.binarySearch(mat[i],t)>=0)c++;
        }
        if(c>0) return true;
        else return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        return res(matrix,target);
    }
}