class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){ //because all positive numbers will give us 0
                break; //exits the loop
            }
            if(i>0 && nums[i] == nums [i-1]){//i>0 else out of bound index will be thrown.
                continue; //means skip this one move to next
            }
            int l=i+1, r= nums.length-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum<0){
                    l++;
                }
                else if(sum>0){
                    r--;
                }else{
                    arr.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r&& nums[l] == nums[l-1]){ //this logic was especially
                    //added -2,0,0,2,2 for this test case
                        l++;
                    }
                }
            }
        }
        return arr;

    }
}
