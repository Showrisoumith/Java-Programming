class Solution {
    public int pivotInteger(int n) {
        int k = -1;
        int s1 = 0;
        for(int i = 1;i<n;i++){
            int s2 = 0;
            s1+=i;
            for(int j=n;j>=i;j--){
                s2+=j;
            }
            if(s1==s2){
                 k=i;
                break;
            }
        }
        if(n==1)return 1;
        else return k;
        
    }
}