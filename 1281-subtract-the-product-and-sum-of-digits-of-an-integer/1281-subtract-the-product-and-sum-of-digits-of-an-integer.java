class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,p=1;
        while(n!=0){
            int l = n%10;
            s+=l;
            p*=l;
            n=n/10;
        }
        return p-s;
    }
}