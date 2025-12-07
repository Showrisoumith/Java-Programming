class Solution {
    public int totalMoney(int n) {
        int c = 0;
         int s = 1;
        while(n!=0){
            if(n<=7){
                for(int i = 0;i<n;i++){
                    c+=s+i;
                }
                  n=0;
            }
            else{
            for(int i = 0;i<7;i++){
                c+=s+ i;
            }
            n=n-7;
            s++;
            }
            //  c+=s;
        }
        return c;
    }

}