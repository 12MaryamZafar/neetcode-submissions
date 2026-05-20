class Solution {
    public int firstMissingPositive(int[] nums) {
        //without sorting case 3 was not passing
       int candidate=1;
       Arrays.sort(nums);
       for(int num:nums){
        if(num>0 && num==candidate){
            candidate++;

        }
        
       }
       return candidate; 
    }
}