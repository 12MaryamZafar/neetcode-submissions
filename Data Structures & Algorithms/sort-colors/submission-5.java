class Solution {
    public void sortColors(int[] nums) {
  //its DNF algo in every condition one var should be changed      
        int i=0, left=0 , right = nums.length-1;

        
            while(i<=right){
                if(nums[i]==0){ //classified
                    swap(nums, left,i);
                    left++;
                    i++;
                }
                else if(nums[i] == 2){ //unclassified
                    swap(nums, i , right);
                    right--;
                    //i--;
                }
                else if(nums[i] == 1){
                    i++; //classified
                }
                
            }
        
    }

    void swap(int nums[] , int i, int j){
        int temp= nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}