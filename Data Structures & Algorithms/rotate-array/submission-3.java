class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k %= n;
//this is the key as first reversing the whole array
//reversing from 0 to k-1th position
//reversing from k to n-1th position
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }
    public void reverse(int[]nums, int l, int r){
        while(l<r){
            int temp=nums[l];
            nums[l]= nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}