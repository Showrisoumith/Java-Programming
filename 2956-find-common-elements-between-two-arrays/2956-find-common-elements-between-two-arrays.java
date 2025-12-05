class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ou = new int[2];
        int a1 = 0, a2 = 0;
        for(int i =0;i<nums1.length;i++){
            int k = 0;
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]) k++;
            }
            if(k>0)a1++;
        }
        for(int i =0;i<nums2.length;i++){
            int k = 0;
            for(int j = 0;j<nums1.length;j++){
                if(nums2[i] == nums1[j]) k++;
            }
            if(k>0)a2++;
        }
        ou[0]=a1;
        ou[1]=a2;
        return ou;
    }
}