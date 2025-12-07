class Solution {
    private boolean td(String i){
        // age is at indices 11 and 12
        int tens = i.charAt(11) - '0';
        int ones = i.charAt(12) - '0';
        int age = tens * 10 + ones;
        return age > 60;
    }
    public int countSeniors(String[] details) {
        int c = 0;
        for(int i =0 ;i<details.length;i++){
            if(td(details[i]))c++;
        }
        return c;
    }
}