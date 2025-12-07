class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int s1 = Arrays.stream(nums1).sum();
        int s2 = Arrays.stream(nums2).sum();
        int diff = s2-s1;
        return (diff/nums1.length);

    }
}