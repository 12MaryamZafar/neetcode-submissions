class Solution {
    public int removeDuplicates(int[] nums) {
        //simply using two pointer approach
        //starting from i=1 because first element is always unique i.e.0th index
        int n= nums.length;
        int count=1;
        for(int i=1; i<n; i++){
            if(nums[i]!= nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}