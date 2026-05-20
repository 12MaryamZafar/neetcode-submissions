class Solution {
    public int removeDuplicates(int[] nums) {
        //as the sets return unique elements so this solves the issue
        //simply copying in array
        TreeSet<Integer> set = new TreeSet<>();

        for(int num:nums){
            set.add(num);
        }
        int i=0;
       for(int num: set){
        nums[i++] = num;
       }

        return set.size();
    }
}