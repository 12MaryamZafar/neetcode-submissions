class Solution {
    public void rotate(int[] nums, int k) {
        //mode is being used
        //When dealing with circular problems (like rotation):
        //If something repeats every n steps, reduce it using modulo.
      int n=nums.length;
      k %= n;
      while(k>0){
        int temp=nums[n-1];
        for(int i= n-1; i>0; i--){
            nums[i] = nums[i-1];
        }

        nums[0] = temp;
        k--;
      }  
    }
}