class Solution {
    public void rotate(int[] nums, int k) {
        //mod is to understand here a%b if a<b than mod is a because
        //it can not divided by b even once.
        int[] temp = new int[nums.length];
        int n=nums.length;
        for(int i=0; i<nums.length; i++){
            temp[(i+k)%n] = nums[i]; 
        }
        for(int i=0; i<n; i++){
            nums[i] = temp[i];
        }
    }
}