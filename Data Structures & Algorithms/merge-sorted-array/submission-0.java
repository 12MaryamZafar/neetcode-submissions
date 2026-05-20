class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     //you can do this, solved on my own.   
        for(int i=m , j=0; i<nums1.length; i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}