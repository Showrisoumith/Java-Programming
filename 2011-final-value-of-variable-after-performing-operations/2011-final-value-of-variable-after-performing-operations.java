class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for(int i = 0;i<operations.length;i++){
            char[] k = operations[i].toCharArray();
                 if(k[0]!='X' && k[0]=='+'){
                    sum++;
                 }
                 else if(k[0] != 'X' && k[0] == '-'){
                    sum--;
                 }
                 else if(k[0]=='X' && k[1]=='-'){
                    sum--;
                 }
                 else if(k[0]=='X' && k[1]=='+'){
                    sum++;
                 }
           
        }
        return sum;
    }
}