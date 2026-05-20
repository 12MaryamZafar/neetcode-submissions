class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //set used because it stores unique elements
        // return type for set is different here
        Set<List<Integer>> list = new HashSet<>();
       Arrays.sort(nums);
       for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            for(int k=j+1; k<nums.length; k++){
                for(int l=k+1; l<nums.length; l++){
                    long sum =(long) nums[i] + nums[j] + nums[k]+ nums[l];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    }
                }
            }
        }
       }
    return new ArrayList<>(list);
        
    }
}