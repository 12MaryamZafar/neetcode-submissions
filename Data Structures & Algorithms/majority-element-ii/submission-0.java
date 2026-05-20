class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // ArrayList<Integer> cars = new ArrayList<Integer>();
        int n=nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> set = new ArrayList<>();
        //key is nums //value is count
        //using arraylist because return type is list
        for(int i=0; i<nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
            if(map.get(nums[i])> n/3){
                if(!set.contains(nums[i])){
                    set.add(nums[i]);
                }
            }
        }
        return set;
    }
}