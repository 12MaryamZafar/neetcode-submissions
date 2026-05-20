class Solution {
    public int[] sortArray(int[] nums) {
    //passed on leetcode but can't satisfy the condition    
        int n= nums.length;
        for(int pass=0; pass<n-1; pass++){
            for(int i=0; i<n-1-pass; i++){
                if(nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }

            }
        }
        return nums;
    }
}