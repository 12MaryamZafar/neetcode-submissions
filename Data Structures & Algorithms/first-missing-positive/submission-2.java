class Solution {
    public int firstMissingPositive(int[] nums) {
        //we were stuck in nums[i] - 1 its the key 
        //as at i=0 value should be 1 this was the key
        //whole problem relies on this
       int n=nums.length;
       int i=0;
       while(i<n){
        if(nums[i]<=0 || nums[i]>n){
            i++;
            continue;
        }
        int index = nums[i] - 1;
        if(nums[i] != nums[index]){
            int temp= nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }else{
            i++;
        }
       }
       for(int j=0; j<n; j++){
        if(nums[j] != j + 1){
            return j+1;
        }
       }
       return n+1;
    }
}