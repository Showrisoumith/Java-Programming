class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(check(i)) lst.add(i);
        }
        return lst;
    }
    private boolean check(int i){
    int k = i;
    boolean res  = true;
    while(k>0){
        int x = k%10;
        if(x==0 ||i%x !=0){
            res = false;
            break;
        }
        k/=10;
    }
    return res;
}
}
