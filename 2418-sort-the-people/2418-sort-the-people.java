class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] hv = new String[n];
        int k = 0;

        while (k < n) {
            int max = Arrays.stream(heights).max().getAsInt(); 

            for (int i = 0; i < n; i++) {
                if (heights[i] == max) {
                    hv[k++] = names[i];
                    heights[i] = -1;
                }
            }
        }
        return hv;
    }
}
